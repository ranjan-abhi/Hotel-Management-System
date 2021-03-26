<%@ page contentType= "text/html; charset = Iso-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%> 
<html>
<h1>Register Page</h1>
<mvc:form action="/CRUD/registerAdmin.mvc" modelAttribute = "CabAdmin">
<table>
	<tr>
		<td><mvc:label path="firstname">First Name:</mvc:label></td>
		<td><mvc:input path="firstname"/></td>
	</tr>
		<tr>
		<td><mvc:label path="lastname">Last Name:</mvc:label></td>
		<td><mvc:input path="lastname"/></td>
	</tr>
	<tr>
		<td><mvc:label path="mailId">Email ID:</mvc:label></td>
		<td><mvc:input path="mailId"/></td>
	</tr>
	<tr>
		<td><mvc:label path="username">User Name:</mvc:label></td>
		<td><mvc:input path="username"/></td>
	</tr>
	<tr>
		<td><mvc:label path="password">Password:</mvc:label></td>
		<td><mvc:password path="password"/></td>
	</tr>
</table>
<input type="submit" value="Register"/>
</mvc:form>
</html>