<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Login Successfull! ${username}</h2>
	<br/>
	<a href="/CRUD/dashboard.puru">Proceed</a>
</body>
</html>