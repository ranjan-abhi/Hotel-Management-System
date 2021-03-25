<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>HotelAdmin Form</title>
</head>
<body>
	<h2>Successful: ${cookie.username.getValue()}</h2>
	<lol:form modelAttribute="admin" action="/CRUD/adminupdateresponse/${cookie.username.getValue()}.puru">
		
		<lol:label path="name">First Name</lol:label>
		<lol:input path="name"></lol:input>
		<hr/>
		<lol:label path="password">Password</lol:label>
		<lol:password path="password"></lol:password>
		<hr/>
		<lol:label path="gender">Gender</lol:label>
		<lol:radiobuttons path="gender" items="${genders}"/>
		<hr/>
		<lol:label path="emailId">MailId</lol:label>
		<lol:input path="emailId"></lol:input>
		<hr/>
		<lol:label path="phNo">Phone Number</lol:label>
		<lol:input path="phNo"></lol:input>
		<hr/>
		<input type="submit" value="Submit"/>
	</lol:form>
</body>


</html>