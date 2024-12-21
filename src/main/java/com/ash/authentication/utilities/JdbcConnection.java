package com.ash.authentication.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/nextin";
	public static final String USER = "root";
	public static final String PASSWORD = "root";

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		System.out.println("trying to connect...");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connection established successfully!");
			return connection;
		} catch (SQLException e) {
			throw new SQLException("Unable to establish a database connection.", e);
		}
	}
}
