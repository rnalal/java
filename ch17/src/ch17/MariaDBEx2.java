package ch17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MariaDBEx2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		
		Course c = new Course();
		c.setId("40002");
		c.setName("모바일운영체제");
		c.setCredit(3);
		c.setLecturer("3");
		c.setWeek(4);
		c.setStart_hour(1400);
		c.setEnd_end(1700);
		
		String sql = "insert into course_tbl values(?, ?, ?, ?, ?, ?, ?)";
		int a = 0;
		conn = MariaDB.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getId());
			pstmt.setString(2, c.getName());
			pstmt.setInt(3, c.getCredit());
			pstmt.setString(4, c.getLecturer());
			pstmt.setInt(5, c.getWeek());
			pstmt.setInt(6, c.getStart_hour());
			pstmt.setInt(7, c.getEnd_end());
			a = pstmt.executeUpdate();
			//sql구문이 select 이면 executeQuery(), 나머진 executeUpdate()
			
			if(a>0) {
				System.out.println("강의등록이 성공적으로 수행되었습니다.");
			} else {
				System.out.println("강의등록이 실패되었습니다.");
			}
			
			MariaDB.close(conn, pstmt);
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
	}
}
