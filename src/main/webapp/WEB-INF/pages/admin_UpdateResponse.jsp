<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>Success</title>
	
</head>
<body>
	<h2>Details for: ${u.username}</h2>
	<h3>Name - ${u.name}</h3>
	<h3>Username - ${u.username}</h3>
	<h3>Password - ${u.password}</h3>
	<h3>Gender - ${u.gender}</h3>
	<h3>emailId - ${u.emailId}</h3>
	<h3>PhoneNumber - ${u.phNo}</h3>
	
	<br/>
	<br/>
	<hr/>
	<h3><a href="/CRUD/dashboard.puru">->Dashboard</a></h3>
</body>


</html>