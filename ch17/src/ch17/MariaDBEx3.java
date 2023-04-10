package ch17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MariaDBEx3 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Course c = new Course();
		c.setId("40002");
		c.setWeek(2);
		c.setStart_hour(1100);
		c.setEnd_end(1500);
				
		String sql = "update course_tbl set week=?, start_hour=?, end_end=? where id=?";
		int a = 0;
		conn = MariaDB.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getWeek());
			pstmt.setInt(2, c.getStart_hour());
			pstmt.setInt(3, c.getEnd_end());
			pstmt.setString(4, c.getId());
			a = pstmt.executeUpdate();
			if(a>0){
				System.out.println("정보 수정이 성공적으로 수행되었습니다.");
			} else {
				System.out.println("정보 수정이 실패되었습니다.");
			}
			MySQL.close(conn,pstmt);
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
	}
}
