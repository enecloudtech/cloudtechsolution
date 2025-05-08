package com.loginuser.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mydb {

	public static Connection getCon() {
		
		Connection con = null;
		//Class.forName("")
		try {
			String ConnectionString = "jdbc:sqlserver://TadahE\\SQLEXPRESS;Database=users;IntegratedSecurity=true";
			con = DriverManager.getConnection(ConnectionString);
			System.out.println(ConnectionString);	
			 		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
