package ch17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OracleEx1 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		String sql = "select * from tbl_member_202201";
		conn = OracleDbc.getConnection();	//연결된 객체
		//.executeQuery()는 select문일 때 사용하며, 반환 타입이 Resultset 임.
		//.executeUpdate()는 insert, delete, update문일 때 사용하며, 반환타입이 int 임.
		ArrayList<Member> memList = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);		//sql 명령을 추가
			rs = pstmt.executeQuery();				//추가된 sql 명령문 실행
			while(rs.next()){						//다음 레코드가 있을 때까지
				Member mem = new Member();
				mem.setSeq(rs.getInt("member_seq"));
				mem.setNo(rs.getString("c_no"));
				mem.setName(rs.getString("c_name"));
				mem.setPhone(rs.getString("phone"));
				mem.setAddress(rs.getString("address"));
				mem.setRegdate(rs.getString("regist_date"));
				mem.setCtype(rs.getString("c_type"));
				memList.add(mem);
			}
			OracleDbc.close(conn, pstmt, rs);
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
		for(Member m : memList){
			System.out.println(m.toString());
		}
	}
}
