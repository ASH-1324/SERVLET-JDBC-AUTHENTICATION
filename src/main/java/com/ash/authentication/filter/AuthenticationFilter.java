package com.ash.authentication.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = { "/userprofile.jsp" })
//@WebFilter("/MyFilter")
public class AuthenticationFilter extends HttpFilter { // its extend Generic filter(GF). and GF implements the filter
	private static final long serialVersionUID = 1L;

	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		HttpSession session = req.getSession(false); // Do not create a new session if it doesn't exist

//      Check if the user is logged in by looking for the 'user' attribute in the session
		if (session == null || session.getAttribute("user") == null) {
			// User is not logged in, redirect to login page
			res.sendRedirect("login.jsp");
			return;
		}

		super.doFilter(req, res, chain);

	}

}
