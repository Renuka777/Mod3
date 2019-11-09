<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals("admin") && password.equals("admin")) {
			request.getRequestDispatcher("LoginSuccessJsp3_1.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("LoginFaulure3_1.jsp").forward(request, response);
		}
	%>
</body>
</html>