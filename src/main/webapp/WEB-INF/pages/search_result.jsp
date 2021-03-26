<%@ page contentType= "text/html; charset = Iso-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<h1>Search Result</h1>  
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<table>  
<tr><th>Id</th><th>CabType</th><th>Location</th><th>DriverName</th><th>VehicleNo.</th><th>Cost/km</th><th>Status</th></tr>  
   <c:forEach items="${list}" var="listElement">
      <tr>
           <td style="text-align:center">${listElement.cabId}</td>
           <td style="text-align:center">${listElement.cabType}</td>
           <td style="text-align:center">${listElement.location}</td>
           <td style="text-align:center">${listElement.driverName}</td>
           <td style="text-align:center">${listElement.vehicleNo}</td>
           <td style="text-align:center">${listElement.costperKm}</td>
           <td style="text-align:center">${listElement.status}</td>
       </tr>
    </c:forEach>
</table>
<br>
<a href="/web_app/createform.mvc">Create Cab</a>
</html>