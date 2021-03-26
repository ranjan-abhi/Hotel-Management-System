<%@ page contentType= "text/html; charset = Iso-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%> 
<html>
<h1>My Profile</h1>
<table>
	<tr>
		<td>First Name: </td>
        <td>${Admin.firstname}</td>
    </tr>
	<tr>
		<td>Last Name: </td>
        <td>${Admin.lastname}</td>
    </tr>
	<tr>
		<td>Email Id: </td>
        <td>${Admin.mailId}</td>
    </tr>
	<tr>
		<td>User Name: </td>
        <td>${Admin.username}</td>
    </tr>
	<tr>
		<td>Password: </td>
        <td>${Admin.password}</td>
    </tr>
</table>
<br>
<a href="/CRUD/home.mvc">Home Page</a>
</html>