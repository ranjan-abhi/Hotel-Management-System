<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="lol"%>

<html>
<head>
<%     
Cookie[] cks=request.getCookies();

for(int i=0;i<cks.length;i++){
		if(cks[i].getName().equals("username"))
				cks[i].setValue((String)request.getAttribute("username"));
}

Cookie username = new Cookie("username",(String)request.getAttribute("username"));
   username.setMaxAge(60*60*24*7);     
   response.addCookie( username );
%>
	<title>Admin response</title>
</head>
<body>
	<h2>Confirm data</h2>
	<hr/>
	<h3>Name - ${u.name}</h3>
	<h3>Username - ${u.username}</h3>
	<h3>Password - ${u.password}</h3>
	<h3>Gender - ${u.gender}</h3>
	<h3>emailId - ${u.emailId}</h3>
	<h3>PhoneNumber - ${u.phNo}</h3>
	<a href="/CRUD/dashboard.puru">Proceed</a>	
</body>


</html>