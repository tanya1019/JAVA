package com.cart.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CartUtility {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?" + "user=root&password=root");
			System.out.println("Successful Connection to Mysql ");
			
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());

		}
		
		return connection;

	}
	public static Connection getConnectionToPostGres() {
		Connection connection = null;
		String url = "jdbc:postgresql://localhost:5432/postgres";
		try {
			connection = DriverManager.getConnection(url,"postgres","admin");
			System.out.println("Successful Connection to PostGres ");
			
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());

		}
		
		return connection;

	}
}
