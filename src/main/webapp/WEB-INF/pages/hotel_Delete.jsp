<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
	<title>Delete your data?</title>
</head>
<body>
	<h2>Delete Your data?</h2>
	<lol:form modelAttribute="hotel" action="hoteldeleteresponse.puru">
		<lol:label path="name">hotelName</lol:label>
		<lol:input path="name"></lol:input>
		<hr/>
		<input type="submit" value="Confirm"/>
	</lol:form>
</body>


</html>