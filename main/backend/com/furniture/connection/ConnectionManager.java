package com.furniture.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

private static Connection connection = null;
	
	private static final String URL = "jdbc:mysql://den1.mysql6.gear.host";
	private static final String USERNAME = "funiturewebsite";
	private static final String PASSWORD = "Kv9K!d7VT_s5";
	
private static void makeConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		
		if(connection == null) {
			makeConnection();
		}
		
		return connection;
	}
}
