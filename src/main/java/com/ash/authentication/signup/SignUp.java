package com.ash.authentication.signup;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.ash.authentication.crud.InsertData;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("userName");
		String email = request.getParameter("userEmail");
		String phoneNumber = request.getParameter("userPhoneNumber");
		String password = request.getParameter("userPassword");

		int flag = InsertData.insertData(name, email, phoneNumber, password); // validating the data insertion

//		checking the data insertion pass or fail
		if (flag == 1) {
//			System.out.println("user found!");

			response.sendRedirect("login.jsp");

//			System.out.println("redirection occur");
		} else {
			response.sendRedirect("signup.jsp");
		}

	}
}
