<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>HotelAdmin Form</title>
</head>
<body>
	<h2>Hotel Administrator SignUp Form</h2>
	<lol:form modelAttribute="admin" action="/CRUD/adminauthresponse.puru">
		<lol:label path="username">UserName:</lol:label><br/>
		<lol:input path="username"></lol:input>
		<hr/>
		<lol:label path="password">Password:</lol:label><br/>
		<lol:password path="password"></lol:password>
		<hr/>
		<input type="submit" value="Submit"/>
	</lol:form>
</body>


</html>