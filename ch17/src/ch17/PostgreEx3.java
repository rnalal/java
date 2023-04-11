package ch17;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PostgreEx3 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		Emp e = new Emp();
		e.setEmpno("");
	}
}
