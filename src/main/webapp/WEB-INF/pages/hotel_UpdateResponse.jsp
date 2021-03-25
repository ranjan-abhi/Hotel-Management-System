<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>Success</title>
</head>
<body>
	<h3>The hotel details have been updated successfully!</h3>
	<br/>
	<br/>
	<hr/>
	<a href="/CRUD/showDetails/${cookie.username.getValue()}.puru">Proceed</a>
</body>


</html>