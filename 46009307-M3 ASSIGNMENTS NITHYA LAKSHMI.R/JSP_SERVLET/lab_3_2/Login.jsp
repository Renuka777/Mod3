<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Login Validation</title>
</head>
<body>
	<%
		String user_name = request.getParameter("username");
		String pass = request.getParameter("password");

		if (user_name.equals("admin") && pass.equals("admin")) {
			request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	%>
</body>
</html>