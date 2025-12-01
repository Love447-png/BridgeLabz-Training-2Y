package com.jdbc.jdbcStudent;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionImpl implements IConnection{
	String  URL ="jdbc:mysql://localhost:3306/StudentManagement";
	String userName="root";
	String password="root";
	 Connection con = null;
     
	public Connection getConnection() {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection(URL,userName,password);
		 System.out.println("Database Connected Successfully");
	}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return con;
}
}

