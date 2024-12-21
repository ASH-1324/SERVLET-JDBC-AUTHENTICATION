package com.ash.authentication.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.ash.authentication.utilities.JdbcConnection;

public class LoginLogic {
	public static int showdata(String email, String password) {

		int flag = 0;

		String query = "select email, password from userdata";

		String emailFromDb = null;
		String passwordFromDb = null;

		try (Connection connection = JdbcConnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
//				Retrieving the user data from database one by one to validate the user 
				emailFromDb = resultSet.getString("email");
				passwordFromDb = resultSet.getString("password");

//				validating the user with email and password from database
				if (email.equals(emailFromDb) && password.equals(passwordFromDb)) {
//					System.out.println("email from DB : " + emailFromDb + "  password from DB : " + passwordFromDb);
					flag = 1;
					break;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			System.out.println("Jdbc Connection class is not found : " + e1.getMessage());
			e1.printStackTrace();
		}
		return flag;
	}
}
