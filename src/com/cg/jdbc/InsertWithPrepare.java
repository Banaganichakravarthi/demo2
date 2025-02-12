package com.cg.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.util.JdbcUtil;

public class InsertWithPrepare {

	public static void main(String[] args) {
		Connection con =JdbcUtil.getconnection();
		PreparedStatement pst=null;
		if(con!=null) {
			String query="insert into employee values(?,?,?,?)";
			try {
			pst=con.prepareStatement(query);
			int empno=111;
			String name="leena";
			String email="leena@gmail.com";
			int salary=3000;
			pst.setInt(1,empno);
			pst.setString(2,name);
			pst.setString(3,email);
			pst.setInt(4,salary);
			int rec=pst.executeUpdate();
			System.out.println("record inserted"+rec);
	
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
				
			}
		}else {
			System.out.println("not connected");
		}

	}

}
