<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>Create Room</title>
</head>
<body>
	<h2>Room update</h2>
	<lol:form modelAttribute="room" action="/CRUD/roomupdateresponse/${id}.puru">
		<lol:label path="roomType">Room Type</lol:label><br/>
		<lol:input path="roomType"></lol:input>
		<hr/>
		<lol:label path="bedSize">Bed Size:</lol:label><br/>
		<lol:input path="bedSize"></lol:input>
		<hr/>
		<lol:label path="noOfAdults">No of Adults:</lol:label><br/>
		<lol:input type="number" path="noOfAdults"/>
		<hr/>
		<lol:label path="noOfRooms">No of Rooms:</lol:label><br/>
		<lol:input path="noOfRooms"></lol:input>
		<hr/>
		<lol:label path="price">Price:</lol:label><br/>
		<lol:input path="price"></lol:input>
		<hr/>
		<input type="submit" value="Update"/>
	</lol:form>
</body>


</html>