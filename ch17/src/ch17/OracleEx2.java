package ch17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OracleEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args){
		Member mem = new Member();
		mem.setNo("20003");
		mem.setName("도도도");
		mem.setPhone("01012345678");
		mem.setAddress("일산");
		mem.setRegdate("20230406");
		mem.setCtype("VIP");
		
		String sql = "insert into tbl_member_202201 values (member_seq.nextval, ?, ?, ?, ?, ?, ?)";
		
		int a=0;
		conn = OracleDbc.getConnection();	//연결된 객체
		
		try {
			pstmt = conn.prepareStatement(sql);		//sql 명령을 추가
			pstmt.setString(1, mem.getNo());		//첫 번째 ?
			pstmt.setString(2, mem.getName());
			pstmt.setString(3, mem.getPhone());
			pstmt.setString(4, mem.getAddress());
			pstmt.setString(5, mem.getRegdate());
			pstmt.setString(6, mem.getCtype());
			
			a = pstmt.executeUpdate();	//추가된 sql 명령을 실행
			if(a>0){
				System.out.println("회원가입이 성공적으로 수행되었습니다.");
			} else {
				System.out.println("회원가입이 실패되었습니다.");
			}
			
			OracleDbc.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
	}
}
