<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>

        <h2>Edit Cab</h2>
        <form:form action="/CRUD/saveForm.mvc" method="post" modelAttribute="Cab">
            <table>
                <tr>
                    <td>Cab Id: </td>
                    <td>${cab.cabId}</td>
                    <td><form:hidden path="cabId" value="${cab.cabId }"/></td>
                </tr>
  
                <tr>
                    <td>Cab Type: </td>
                    <td><form:select path="cabType" itemvalue="${cab.cabType}" items="${types }"/></td>
                </tr>
                <tr>
                    <td>Location: </td>
                    <td><form:input path="location" value="${cab.location}"/></td>
                </tr>
                <tr>
                    <td>Vehicle No.: </td>
                    <td><form:input path="vehicleNo" value="${cab.vehicleNo}"/></td>
                </tr>
                <tr>
                    <td>Driver Name: </td>
                    <td><form:input path="driverName" value="${cab.driverName}"/></td>
                </tr>
                <tr>
                    <td>Cost/Km: </td>
                    <td><form:input path="costperKm" value="${cab.costperKm}"/></td>
                </tr>    
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
</body>
</html>