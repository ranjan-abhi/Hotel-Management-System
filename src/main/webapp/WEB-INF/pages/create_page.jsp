<%@ page contentType= "text/html; charset = Iso-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%> 

<html>
<h2>Cab Registration Form</h2>
<style>  
.error{color:red}  
</style> 
<mvc:form modelAttribute = "Cab" action="/CRUD/submitForm.mvc">
<table>
	<tr>
		<td><mvc:label path="cabType">Car Type:</mvc:label></td>
		<td><mvc:select path="cabType" items="${types}"/></td>
		<td><mvc:errors path="cabType" cssClass="error" /></td>
	</tr>
	<tr>
		<td><mvc:label path="location">Location:</mvc:label></td>
		<td><mvc:input path="location"/></td>
		<td><mvc:errors path="location" cssClass="error" /></td>
	</tr>
	<tr>
		<td><mvc:label path="driverName">Driver Name:</mvc:label></td>
		<td><mvc:input path="driverName"/></td>
		<td><mvc:errors path="driverName" cssClass="error" /></td>
	</tr>
	<tr>
		<td><mvc:label path="costperKm">Cost/Km:</mvc:label></td>
		<td><mvc:input path="costperKm"/></td>
		<td><mvc:errors path="costperKm" cssClass="error" /></td>
	</tr>
	<tr>
		<td><mvc:label path="vehicleNo">Vehicle No.:</mvc:label></td>
		<td><mvc:input path="vehicleNo"/></td>
		<td><mvc:errors path="vehicleNo" cssClass="error" /></td>
	</tr>
	<tr></tr>
	<tr>
		<td> <input type = "submit" value="Submit" />  </td>
	</tr>
</table>
</mvc:form>

</html>