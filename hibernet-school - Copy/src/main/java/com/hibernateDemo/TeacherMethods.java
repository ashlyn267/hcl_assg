package com.hibernateDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hibernateConnection.TeacherConnection;

public class TeacherMethods {
	
	Connection con;
	public Teacher saveCustomer(Teacher teacher) {
		
		con = TeacherConnection.getConnection();
		
		String insert="insert into teacher value(?,?,?)";
		
		try {
			PreparedStatement ps=con.prepareStatement(insert);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teacher;
		

}
}
