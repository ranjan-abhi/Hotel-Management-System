<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel details</title>
</head>
<body>
	<h2>Hotel Details: ${cookie.username.getValue()}</h2>
	<hr/>
	<h4>Name= ${u.name}</h4>
	<h4>Address= ${u.address}</h4>
	<h4>Email Id= ${u.emailId}</h4>
	<h4>Phone number= ${u.phNo}</h4>
	<h4>Stars= ${u.stars}</h4>
	<h4>Amenities= ${u.amenities}</h4>
	
	<h4>Description= ${u.description}</h4>
	<h4>Average Price= ${u.avgPrice}</h4>
	<hr/>
	<a href="/CRUD/updatehotel.puru"><button>Edit HotelData</button></a><br/>
	<a href="/CRUD/dashboard.puru"><button>Dashboard</button></a>
</body>
</html>