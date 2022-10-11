package com.hibernateConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TeacherConnection {
	
	public static Connection getConnection() {
		
		try {
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher_crud", "root", "root");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
