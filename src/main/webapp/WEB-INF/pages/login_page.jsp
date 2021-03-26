<%@ page contentType= "text/html; charset = Iso-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%> 
<html>
<h1>Login Page</h1>


<form action="/CRUD/authenticator.mvc">
  <label for="uname">User name:</label><br>
  <input type="text" id="uname" name="uname"><br>
  <label for="upwd">Password:</label><br>
  <input type="password" id="upwd" name="upwd"><br><br>
  <input type="submit" value="Login">
</form> 
</html>