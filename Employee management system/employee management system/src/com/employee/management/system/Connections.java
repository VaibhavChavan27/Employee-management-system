package com.employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connections {

	Connection connection;
	Statement statement;
	
	public Connections() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement" , "root","root@999");
			statement = connection.createStatement();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}