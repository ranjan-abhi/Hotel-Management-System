<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>

        <h2>Update Profile</h2>
        <form:form action="/CRUD/saveAdmin.mvc" method="post" modelAttribute="Admin">
            <table>
                <tr>
                    <td>Id: </td>
                    <td>${Admin.id}</td>
                </tr>
  
                <tr>
                    <td>First Name: </td>
                    <td><form:input path="firstname" value="${Admin.firstname}"/></td>
                </tr>
                <tr>
                    <td>Last Name: </td>
                    <td><form:input path="lastname" value="${Admin.lastname}"/></td>
                </tr>
                <tr>
                    <td>Email Id: </td>
                    <td><form:input path="mailId" value="${Admin.mailId}"/></td>
                </tr>
                <tr>
                    <td>User Name: </td>
                    <td><form:input path="username" value="${Admin.username}"/></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><form:input path="password" value="${Admin.password}"/></td>
                </tr>    
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
</body>
</html>