<%@ page contentType= "text/html; charset = Iso-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<h1>Cabs List</h1>  
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<table>  
<tr><th>Id</th><th>CabType</th><th>Location</th><th>DriverName</th><th>VehicleNo.</th><th>Cost/km</th><th></th><th></th></tr>  
   <c:forEach items="${cabs}" var="listElement">
      <tr>
           <td style="text-align:center">${listElement.cabId}</td>
           <td style="text-align:center">${listElement.cabType}</td>
           <td style="text-align:center">${listElement.location}</td>
           <td style="text-align:center">${listElement.driverName}</td>
           <td style="text-align:center">${listElement.vehicleNo}</td>
           <td style="text-align:center">${listElement.costperKm}</td>
           <td style="text-align:center">${listElement.status}</td>
           <td style="text-align:center"><a href="/CRUD/editform.mvc?id=${listElement.cabId}">Edit</a></td>
           <td style="text-align:center"><a href="/CRUD/delete.mvc?id=${listElement.cabId}">Delete</a></td>
       </tr>
    </c:forEach>
</table>
<br>
<a href="/CRUD/home.mvc">Home Page</a>
</html>