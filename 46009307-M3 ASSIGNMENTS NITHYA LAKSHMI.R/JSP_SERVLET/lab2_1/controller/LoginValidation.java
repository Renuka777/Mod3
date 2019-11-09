package com.servletPages;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/LoginValidation", "/Login" })
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginValidation() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user_name = request.getParameter("username");
		String user_pass = request.getParameter("password");

		if (user_name.equals("admin") && user_pass.equals("admin")) {
			RequestDispatcher rd = request.getRequestDispatcher("succesLogin.html");
			rd.forward(request, response);
		} else {
			request.getRequestDispatcher("failureLogin.html").forward(request, response);
		}

	}

}
