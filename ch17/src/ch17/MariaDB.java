package ch17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//mariadb-java-client-3.1.3.jar 로 Build Path에 라이브러리 추가
public class MariaDB {
		private final static String DRIVER = "org.mariadb.jdbc.Driver";
		private final static String URL = "jdbc:mariadb://127.0.0.1:3308/company";
		private final static String USER = "root";
		private final static String PASS = "1234";
		
		public static Connection getConnection() {
			Connection conn = null;
			try {
				Class.forName(DRIVER);
				try {
					conn = DriverManager.getConnection(URL, USER, PASS);
				} catch (SQLException e) {
					System.out.println("데이터베이스 연결 실패~!");
				}
			}catch (ClassNotFoundException e){
				System.out.println("드리이버 로딩 실패~!");
			}
			return conn;
		}
		public static void close(Connection conn, PreparedStatement pstmt){
			try {
				pstmt.close();
				try {
					conn.close();
				} catch(Exception e) {
					System.out.println("데이터베이스를 닫지 못했습니다.");
				}
			} catch (SQLException e){
				System.out.println("데이터베이스의 상태 연결을 끊지 못했습니다.");
			}
		}
		public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs){
			try {
				rs.close();
				try {
					pstmt.close();
					try {
						conn.close();
					} catch(Exception e) {
						System.out.println("데이터베이스를 닫지 못했습니다.");
					}
				} catch (SQLException e) {
					System.out.println("데이터베이스의 상태 연결을 끊지 못했습니다.");
				}
			} catch (SQLException e1) {
				System.out.println("쿼리를 종료하지 못했습니다.");
			}
		}
	}

