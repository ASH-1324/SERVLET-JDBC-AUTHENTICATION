package com.ash.authentication.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import com.ash.authentication.crud.LoginLogic;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("userEmail");
		String password = request.getParameter("userPassword");

//		inserting the data from database
		int flag = LoginLogic.showdata(email, password); // validating the user

		if (flag == 1) {
//			if login successful we are creating session for future validation
			HttpSession session = request.getSession();
			session.setAttribute("user", email); // Using the email

//			before the redirecting AuthenticationFilter class will be execute to check user authentication
			response.sendRedirect("userprofile.jsp");
		} else {
			response.sendRedirect("userprofile.jsp");
		}

	}

}
