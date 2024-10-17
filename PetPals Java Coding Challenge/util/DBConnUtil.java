package com.hexaware.petPals.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnUtil {
	public static Connection getDBConnection() {
	    Connection conn = null;
	    try {
	        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pet", "root", "2002");
	    } catch (SQLException e) {
	        System.err.println("Failed to connect to the database: " + e.getMessage());
	        e.printStackTrace(); // Add proper logging or print to trace the issue
	    }
	    return conn;
	}
}
