<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>Update Hotel</title>
</head>
<body>
	<h2>Update Hotel ${cookie.username.getValue()} </h2>
	<lol:form modelAttribute="hotel" action="hotelupdateresponse/${cookie.username.getValue()}.puru">
		<lol:label path="name">Name</lol:label><br/>
		<lol:input path="name"></lol:input>
		<hr/>
		<lol:label path="address">Address</lol:label><br/>
		<lol:input path="address"></lol:input>
		<hr/>
		<lol:label path="emailId">Official Email Id</lol:label><br/>
		<lol:input path="emailId"></lol:input>
		<hr/>
		<lol:label path="phNo">Ph-No</lol:label><br/>
		<lol:input path="phNo"></lol:input>
		<hr/>
		<lol:label path="stars">Stars</lol:label><br/>
		<lol:input path="stars" value="5 Star Hotel" ></lol:input>
		<hr/>
		<lol:label path="amenities">Amenities</lol:label><br/>
		<lol:input path="amenities" value="Enter amenities seperated by a comma"></lol:input>
		<hr/>
		<lol:label path="description">Description</lol:label><br/>
		<lol:input path="description" value="Short description"></lol:input>
		<hr/>
		<lol:label path="avgPrice">Enter The Average Price</lol:label><br/>
		<lol:input path="avgPrice"></lol:input>
		<hr/>
		
		
		<input type="submit" value="Submit"/>
	</lol:form>
</body>


</html>