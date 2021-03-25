<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
  <style>
		h1 {text-align: center;} 
		table {width: 500px; height: 100px; margin: 0 auto;}

		.center {
		  margin: 0;
		  position: absolute;
		  top: 50%;
		  left: 50%;
		  -ms-transform: translate(-50%, -50%);
		  transform: translate(-50%, -50%);
		}
	</style>
	
<h1>Dish List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th><th>Description</th><th>Rating</th><th>Price</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="dish" items="${list}">   
   <tr>  
   <td>${dish.getName()}</td>  
   <td>${dish.getDescription()}</td>  
   <td>${dish.getRating()}</td>
    <td>${dish.getPrice()}</td>
   <td><a href="/CRUD/edit/dish/${dish.getId()}">Edit</a></td>  
   <td><a href="/CRUD/delete/dish/${dish.getId()}">Delete</a></td>   
   </tr>  
   </c:forEach>  
   </table>  
   <br/>
  <div class="center">
    <button onclick="document.location='/CRUD/homepage'">Back</button>
  </div>    