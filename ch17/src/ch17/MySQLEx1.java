package ch17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySQLEx1 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		String sql = "select * from test2";
		conn = MySQL.getConnection();	
		
		ArrayList<Test2> testList = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);		
			rs = pstmt.executeQuery();				
			while(rs.next()){						
				Test2 test2 = new Test2();
				test2.setId(rs.getString("id"));
				test2.setPw(rs.getString("pw"));
				test2.setName(rs.getString("name"));
				testList.add(test2);				
			}
			OracleDbc.close(conn, pstmt, rs);
		} catch (SQLException e) {
			System.out.println("SQL 실행이 정상적으로 실행되지 못했습니다.");
		}
		for(Test2 t : testList){
			System.out.println(t.toString());
		}
	}
}
