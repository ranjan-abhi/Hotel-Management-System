<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>display all</title>
</head>
<body>
	<h2>List of hotels</h2>
	<hr/>
	<c:forEach items="${temp}" var="item">  
   		->${item.name}<br/>  
	</c:forEach>  
	
</body>


</html>