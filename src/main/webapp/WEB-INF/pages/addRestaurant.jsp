<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <title>Add Restaurant</title>
    <style>
 
    *{
        margin:0;
        padding: 0;
        box-sizing: border-box;
    }
    html{
        height: 100%;
    }
    body{
        font-family: 'Segoe UI', sans-serif;;
        font-size: 1rem;
        line-height: 1.6;
        height: 100%;
    }
    .wrap {
        width: 100%;
        height: 100%;
        display: grid;
        justify-content: center;
        align-items: center;
        background: #fafafa;
    }
    .login-form{
        width: 350px;
        margin: 0 auto;
        border: 1px solid #ddd;
        padding: 2rem;
        background: #ffffff;
    }
    .form-input{
        background: #fafafa;
        border: 1px solid #eeeeee;
        padding: 12px;
        width: 100%;
    }
    .form-group{
        margin-bottom: 1rem;
    }
    .form-button{
        background: #33ccff;
        border: 1px solid #ddd;
        color: #ffffff;
        padding: 10px;
        width: 100%;
        text-transform: uppercase;
    }
    .form-button1{
        background: #262626;
        border: 1px solid #ddd;
        color: #ffffff;
        padding: 10px;
        width: 100%;
        text-transform: uppercase;
    }
    .form-button:hover{
        background: #69c8e7;
    }
    .form-header{
        text-align: center;
        margin-bottom : 2rem;
    }
    .form-footer{
        text-align: center;
    }
    </style>
</head>
<body>
    
    <div class="container-fluid">
    <div class="wrap">
    	
    
        <form:form method="POST" modelAttribute="restaurant" action="/CRUD/homepage">
            
            <div class="form-header">
            <h5>Welcome ${restaurantAdmin.getFirstname()}</h5>
                <h2>Enter restaurant details</h2>
            </div>
            <!--Email Input-->
            <div class="form-group">
            	<form:label path="name">Name</form:label>
                <form:input path="name" name="namee" id="name" type="text" class="form-input" placeholder="Name"/>
            </div>
            <!--Password Input-->
            <div class="form-group">
            	<form:label path="about">About</form:label>
                <form:input path="about" name="about" id="about" type="text" class="form-input" placeholder="About" />
            </div>
            
            <div class="form-group">
            	<form:label path="noOfDish">No. Of Dish</form:label>
                <form:input path="noOfDish" name="noOfDish" id="noOfDish" type="text" class="form-input" placeholder="No. Of Dish" />
            </div>
            
            <div class="form-group">
            	<form:label path="address">Address</form:label>
                <form:input path="address" name="address" id="address" type="text" class="form-input" placeholder="Address" />
            </div>
            
            <div class="form-group">
            	<form:label path="mobile">Mobile</form:label>
                <form:input path="mobile" name="mobile" id="mobile" type="text" class="form-input" placeholder="Mobile" />
            </div>
            
            <!--Login Button-->
            <div class="form-group">
                <button class="form-button" type="submit">Submit</button>
            </div>
         </form:form>
         <div class="form-group">
                <button onclick="document.location='/CRUD/login'" class="form-button1" type="submit">Logout</button>
            </div>
    </div><!--/.wrap-->
    </div>
</body>
</html>
  <%-- 	<style>
		h1 {
    text-align : center;
}
		form {
    width: 300px; height: 300px; margin: 0 auto;
} 
	</style>
        <h1>Welcome ${restaurantAdmin.getFirstname()}</h1>  
       <form:form method="POST" modelAttribute="restaurant" action="/CRUD/homepage">    
        <table >      
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>No. of Dishes :</td>    
          <td><form:input path="noOfDish" /></td>  
         </tr>   
           <tr>    
          <td>Address :</td>    
          <td><form:input path="address" /></td>  
         </tr> 
         <tr>    
          <td>Mobile no. :</td>    
          <td><form:input path="mobile" /></td>  
         </tr> 
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Submit" /></td>    
         </tr>    
        </table>    
       </form:form>    
       --%>