<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login failed</title>
</head>
<body>
	<h2>Username: ${u.username} or password: ${u.password} doesn't match</h2>
	<br/>
	<a href="adminauth.puru">Try Logging in again</a><br/>
	<br/>
	<a href="adminsignup.puru">Not a member? Sign-up for free</a><br/>
	
</body>
</html>