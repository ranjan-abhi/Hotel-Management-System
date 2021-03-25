<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>Delete your data?</title>
</head>
<body>
	<h2>Delete Your data?</h2>
	<lol:form modelAttribute="room" action="roomdeleteresponse.puru">
		<lol:label path="roomType">Enter Room Type</lol:label>
		<lol:input path="roomType"></lol:input>
		<hr/>
		<input type="submit" value="Confirm"/>
	</lol:form>
</body>


</html>