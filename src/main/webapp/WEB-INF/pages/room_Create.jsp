<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>Create Room</title>
</head>
<body>
	<h2>Add Rooms</h2>
	<hr/>
	<lol:form modelAttribute="room" action="/CRUD/roomresponse/${cookie.username.getValue()}.puru">
		<lol:label path="roomType">Room Type:</lol:label><br/>
		<lol:input path="roomType"></lol:input>
		<br/>
		<lol:label path="bedSize">Bed Size:</lol:label><br/>
		<lol:input path="bedSize"></lol:input>
		<br/>
		<lol:label path="noOfAdults">No of Adults:</lol:label><br/>
		<lol:input path="noOfAdults"/>
		<br/>
		<lol:label path="noOfRooms">No of Rooms:</lol:label><br/>
		<lol:input path="noOfRooms"></lol:input>
		<br/>
		<lol:label path="facilities">Facilities:</lol:label><br/>
		<lol:input path="facilities" value="Enter comma seperated facilities"></lol:input>
		<br/>
		<lol:label path="price">Price:</lol:label><br/>
		<lol:input path="price"></lol:input>
		<br/>
		
		<input type="submit" value="Create"/>
	</lol:form>
	<a href="/CRUD/dashboard.puru"><button>Back</button></a>
</body>


</html>