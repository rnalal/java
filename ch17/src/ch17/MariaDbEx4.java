package ch17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MariaDbEx4 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		
		Course c = new Course();
		c.setId("40002");
	
		String sql = "delete from course_tbl where id=?";
		int a = 0;
		conn = MariaDB.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getId());
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("정보 삭제가 성공적으로 수행되었습니다.");
			} else {
				System.out.println("정보 삭제가 실패되었습니다.");
			}
			MySQL.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
	}
}
