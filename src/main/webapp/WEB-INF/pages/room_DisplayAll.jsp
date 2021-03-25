<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
	<title>display all</title>
</head>
<body>
	<h2>List of Available Rooms </h2>
	<hr/>
	<table  style="width:100%">
	<caption>Room Details</caption>
  <tr>
    <th>Room Type</th>
    <th>Bed Size</th>
    <th>Facilities</th>
    <th>No of Adults</th>
    <th>No of Rooms</th>
    <th>Price</th>
    <th>Booked Rooms</th>
    <th>Edit</th>
    <th>Delete</th>
  </tr>
  
    <c:forEach items="${temp}" var="item">
    <tr>  
    	<td>${item.roomType}</td>
    	<td>${item.bedSize}</td>
    	<td>${item.facilities}</td>
    	<td>${item.noOfAdults}</td>
    	<td>${item.noOfRooms}</td>
    	<td>${item.price}</td>
    	<td>${item.bookedrooms}</td> 
    	<td><a href="/CRUD/updateroom/${item.id}.puru">Edit</a></td>
    	<td><a href="/CRUD/deleteresponse/${item.id}/${cookie.username.getValue()}.puru">Delete</a></td> 
	</tr>
	
	</c:forEach> 
  	
  
</table>
<br/>
	 <a href="/CRUD/dashboard.puru"><button>Dashboard</button></a>
</body>


</html>