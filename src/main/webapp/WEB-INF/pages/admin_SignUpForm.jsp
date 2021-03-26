<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>HotelAdmin Form</title>
</head>
<body>
	<h2>Hotel Administrator SignUp Form</h2>
	<lol:form modelAttribute="admin" action="adminresponse.puru">
		<lol:label path="name">First Name:</lol:label><br/>
		<lol:input path="name"></lol:input>
		<hr/>
		<lol:label path="username">UserName:</lol:label><br/>
		<lol:input path="username"></lol:input>
		<hr/>
		<lol:label path="password">Password:</lol:label><br/>
		<lol:password path="password"></lol:password>
		<hr/>
		<lol:label path="gender">Gender:</lol:label><br/>
		<lol:radiobuttons path="gender" items="${genders}"/>
		<hr/>
		<lol:label path="emailId">MailId:</lol:label><br/>
		<lol:input path="emailId"></lol:input>
		<hr/>
		<lol:label path="phNo">Phone Number:</lol:label><br/>
		<lol:input path="phNo"></lol:input>
		<hr/>
		<input type="submit" value="Submit"/>
	</lol:form>
</body>


</html>