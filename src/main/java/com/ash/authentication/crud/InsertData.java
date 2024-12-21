package com.ash.authentication.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ash.authentication.utilities.JdbcConnection;

public class InsertData {
	public static int insertData(String name, String email, String phoneNumber, String password) {

		int flag = 0;

		String query = "INSERT INTO userdata (name, email, phoneNumber, password) VALUES (?, ?, ?, ?)";

//		Use try-with-resources to automatically close the resources
		try (Connection connection = JdbcConnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

//			Set the user input as parameters for the PreparedStatement
			statement.setString(1, name);
			statement.setString(2, email);
			statement.setString(3, phoneNumber);
			statement.setString(4, password);

			int rowsAffected = statement.executeUpdate(); // inserting the data

//			checking the data insertion
			if (rowsAffected > 0) {
				flag = 1;  //data insertion is successful
			}
			
		} catch (SQLException e) {
			System.err.println("Error while inserting data: " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			System.out.println("Jdbc Connection class is not found : " + e1.getMessage());
			e1.printStackTrace();
		}
		return flag;
	}
}
