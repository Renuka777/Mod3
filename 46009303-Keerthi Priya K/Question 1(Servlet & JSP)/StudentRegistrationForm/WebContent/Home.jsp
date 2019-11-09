<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>StudentRegistrationForm</title>
</head>
<body>
    <h1>Student Registration Form</h1><br />
<table>
      <form action="StudentController" method="post">
      <tr><td>Student Name:</td><td><input type="text" name="studentName" id="name"  required /></td><td></td></tr>
       <tr><td>Student Department:</td><td><input type="text" name="studentDepartment" id="department"  required/></td><td></td></tr>
      <tr><td>12th marks:</td><td> <input type="text" name="marks" id="marks"  required/></td><td></td></tr>
       <tr><td>Mobile no:</td><td><input type="text" name="mobile" id="mobile"  required/></td><td></td></tr>
       <tr><td>Percentage:</td><td><input type="text" name="percentage" id="percentage"  required /></td><td></td></tr>
      <tr><td><input type="submit" value="Submit"></tr></td>
    </form>
   
   
    </table>
</body>
</html>