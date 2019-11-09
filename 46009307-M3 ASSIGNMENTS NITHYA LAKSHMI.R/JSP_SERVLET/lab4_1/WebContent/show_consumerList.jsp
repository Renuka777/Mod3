<%@page import="com.model.Consumers"%>
<%@page import="com.controller.ConsumerDTO"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW CONSUMER</title>
<style type="text/css">
	table,th{
		font-weight: bold;
	}
	.table_style{
		border: 4px solid black;
		font-size: 25px;
	}	
</style>
</head>
<body>
	<%
		ConsumerDTO c1 = new ConsumerDTO();
		List<Consumers> cons = c1.retrieveAllConsumers();
		session.setAttribute("consList", cons);
	%>
	
	<table class="table_style">
		<tr>
			<th>User Id</th>
			<th>User Name</th>
			<th>Address</th>
		</tr>
		<c:forEach items="${consList}" var="i">
			<tr>
				<td>${i.consumerNum}</td>
				<td>${i.consumerName}</td>
				<td>${i.address}</td>
				<td><a href="show_bills.jsp">Show bill details</a></td>
			</tr>
		</c:forEach>
	</table>
	<h1>
		<a href="view.html">Home</a>
	</h1>
</body>
</html>