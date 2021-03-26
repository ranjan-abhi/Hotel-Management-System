<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>

<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body>
<div>
<h2> Hello ${cookie.username.getValue()}</h2>

		<form>
				 <fieldset>
						  <legend>Administrator Actions:</legend>
							<a href="/CRUD/displayAdminData/${cookie.username.getValue()}.puru">View Personal Details</a><br/>
							<a href="updateadminaccount.puru">Update Personal Details</a><br/> 
							<a href="deleteadmin.puru">Delete My Account</a><br/>	
				 </fieldset>
				 				 <br/>				 
				 
				 <fieldset>
						  <legend>Hotel Actions:</legend>
						  <a href="updatehotel.puru">Edit HotelData</a><br/>
						  <a href="/CRUD/showDetails/${cookie.username.getValue()}.puru">View HotelData</a>
						  <p>view orders</p>
				 </fieldset>
				 <br/>				 
				 <fieldset>
						  <legend>Room Actions:</legend>
						  <a href="roomcreate.puru">Add Rooms</a><br/>
						  <a href="seeallrooms/${cookie.username.getValue()}.puru">View/Edit/Delete Rooms</a><br/>
				 </fieldset>
		</form>
</div>
<br/>
</body>
</html>