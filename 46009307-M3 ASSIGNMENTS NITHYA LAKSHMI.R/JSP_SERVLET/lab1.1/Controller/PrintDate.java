package com.servletPages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/PrintDate", "/viewDate" })
public class PrintDate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PrintDate() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// String getDate = request.getParameter("date_view");
		LocalDate localDates = LocalDate.now();
		PrintWriter out = response.getWriter();
		out.println("<h1> Today's Date is " + localDates + "</h1>");

//		response.sendRedirect("index.html");
	}

}
