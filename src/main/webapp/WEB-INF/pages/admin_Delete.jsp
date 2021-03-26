<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>Delete your data : ${cookie.username.getValue()}?</title>
</head>
<body>
	<h2>Delete Your data : ${cookie.username.getValue()}?</h2>
	<lol:form modelAttribute="admin" action="admindeleteresponse.puru">
		<lol:label path="username" value="${cookie.username.getValue()}">User Name</lol:label>
		<lol:input path="username"></lol:input>
		<hr/>
		<input type="submit" value="Confirm"/>
	</lol:form>
</body>


</html>