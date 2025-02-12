package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	public static Connection getconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		String url="jdbc:mysql://localhost:3306/empdb";
		String user="root";
		String password="root";
		Connection con = null;
		try {
		     con=DriverManager.getConnection(url, user, password);
		} catch(SQLException e) {
			e.printStackTrace();
	}
		return con;
	}
}
