<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>Hotel response</title>
</head>
<body>
	<h2>Hotel details</h2>
	<hr/>
	<h1>Name</h1>
	<h2>${u.name}</h2>
	<hr/>
	<h1>Address</h1>
	<h2>${u.address}</h2>
	<hr/>
	<h1>mail</h1>
	<h2>${u.emailId}</h2>
	<hr/>
	<h1>stars</h1>
	<h2>${u.stars}</h2>
	<hr/>
	<h1>cabservice selection</h1>
	<h2>${u.cabService}</h2>
	<hr/>
	<h1>PhoneNumber</h1>
	<h2>${u.phNo}</h2>
	<hr/>
	<a href="dashboard.puru">->Dashboard</a>
	
</body>


</html>