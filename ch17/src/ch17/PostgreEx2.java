package ch17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostgreEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Emp e = new Emp();
		e.setEmpno("1008");
		e.setEmpname("구사원");
		e.setTel1("010");
		e.setTel2("1111");
		e.setTel3(1234);
		e.setDeptcode("20");
		e.setPosition("2");
		
		String sql = "insert into tbl_emp_202108 values(?, ?, ?, ?, ?, ? ,?)";
		int a = 0;
		conn = Postgre.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, e.getEmpno());
			pstmt.setString(2, e.getEmpname());
			pstmt.setString(3, e.getTel1());
			pstmt.setString(4, e.getTel2());
			pstmt.setInt(5, e.getTel3());
			pstmt.setString(6, e.getDeptcode());
			pstmt.setString(7, e.getPosition());
			a = pstmt.executeUpdate();
			
			if(a>0) {
				System.out.println("등록이 성공적으로 수행되었습니다.");
			} else{
				System.out.println("등록을 실패했습니다.");
			}
			
			Postgre.close(conn, pstmt);
		} catch (SQLException e1) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");			
		}
	}
}
