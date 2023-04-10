package ch17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MariaDBEx1 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		String sql = "select * from course_tbl";
		conn = MariaDB.getConnection();
		ArrayList<Course> courseList = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Course course = new Course();
				course.setId(rs.getString("id"));
				course.setName(rs.getString("name"));
				course.setCredit(rs.getInt("credit"));
				course.setWeek(rs.getInt("week"));
				course.setStart_hour(rs.getInt("start_hour"));
				course.setEnd_end(rs.getInt("end_end"));
				courseList.add(course);
			}
			OracleDbc.close(conn, pstmt, rs);
		} catch (SQLException e){
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
		for(Course c : courseList){
			System.out.println(c.toString());
		}
	}
}
