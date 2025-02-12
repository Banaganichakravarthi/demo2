package com.cg.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class selectdemo {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			}
		String url="jdbc:mysql://localhost:3306/empdb";
		String user="root";
		String password="root";
		Connection con = null;
		Statement st=null;
		ResultSet rs=null;
		try {
		     con=DriverManager.getConnection(url, user, password);
		     if (con!=null) {
		    	 System.out.println("connected");
		    	 st=con.createStatement();
		    	 String query="select * from employee";
		    	   rs=st.executeQuery(query);
		    	   while(rs.next()) {
		    		   System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "); }
		     }
		     else {
		    	 System.out.println(" not connected");
		    	 
		     }
		}
		catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			rs.close();
			st.close();
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
}
