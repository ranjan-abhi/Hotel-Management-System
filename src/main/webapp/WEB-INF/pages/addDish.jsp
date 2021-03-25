<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  	
  	<style>
		h1 {
    text-align : center;
}
		form {
    width: 300px; height: 300px; margin: 0 auto;
} 
	</style>
	<div class="container-fluid">
        <h1>Enter dish details</h1>  
       <form:form method="POST" modelAttribute="Dish" action="/CRUD/create/dish">    
        <table >       
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Description : </td>    
          <td><form:input path="description" /></td>  
         </tr>
         <tr>    
          <td>Price : </td>    
          <td><form:input path="price" /></td>  
         </tr> 
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Submit" /></td>    
         </tr>    
        </table>    
       </form:form>   
       </div> 