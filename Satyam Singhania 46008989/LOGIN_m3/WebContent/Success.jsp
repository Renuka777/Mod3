<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="Controller.LoginController" %>
    <%@page import= "java.time.LocalDate" %>
    <%@page  import ="java.time.format.DateTimeFormatter"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		LocalDate l1 = LocalDate.now();
		String s1 = request.getParameter("user_name");
		out.println("<h2>Welcome User " + s1 + "</h2>");
		out.println("<h2>Date : " + l1 + "</h2>");
	%>
</body>
</html>