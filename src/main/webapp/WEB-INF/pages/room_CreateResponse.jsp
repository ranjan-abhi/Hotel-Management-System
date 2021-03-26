<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>Room response</title>
</head>
<body>
	<h2>Room details</h2>
	<hr/>
	<h3>Room Type - ${u.roomType}</h3>
	<h3>bed Size - ${u.bedSize}</h3>
	<h3>no of adults - ${u.noOfAdults}</h3>
	<h3>no of rooms - ${u.noOfRooms}</h3>
	<h3>price - ${u.price}</h3>	
	
	<hr/>
	<a href="/CRUD/dashboard.puru"><button>Dashboard</button></a>
</body>


</html>