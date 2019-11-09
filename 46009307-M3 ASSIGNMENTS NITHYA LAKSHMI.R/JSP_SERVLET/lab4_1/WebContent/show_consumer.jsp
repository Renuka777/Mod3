<%@page import="com.model.Consumers"%>
<%@page import="com.controller.ConsumerDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Consumer</title>
<style type="text/css">
table {
	border: 4px solid black;
	font-size: 25px;
}

.heading {
	font-weight: bold;
}
</style>
</head>
<body>
	<%
		/* int user_id = Integer.parseInt(request.getParameter("search_box")); */
		int user_id = -1;
		if (request.getParameter("search_box") != null) {
			user_id = Integer.parseInt(request.getParameter("search_box"));
		}
		ConsumerDTO cons = new ConsumerDTO();
		Consumers c1 = cons.retrieveUsingId(user_id);
		session.setAttribute("consObj", c1);
	%>

	<table>
		<caption>Consumer Details</caption>
		<tr>
			<td class="heading">Consumer Number</td>
			<td>${consObj.consumerNum}</td>
		</tr>
		<tr>
			<td class="heading">Consumer Name</td>
			<td>${consObj.consumerName}</td>
		</tr>
		<tr>
			<td class="heading">Consumer Address</td>
			<td>${consObj.address}</td>
		</tr>
		<tr>
			<td><a href="show_bills.jsp">Show bill details</a></td>
		</tr>
	</table>
	<h1>
		<a href="view.html">Home</a>
	</h1>
</body>
</html>