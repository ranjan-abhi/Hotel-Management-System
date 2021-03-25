<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">    

<%-- 
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  
<meta name="viewport" content="width=device-width, initial-scale=1">
<style> 
input[type=text] {
  width: 230px;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
  font-size: 16px;
  background-color: white;
  background-image: url('searchicon.png');
  background-position: 10px 10px; 
  background-repeat: no-repeat;
  padding: 12px 20px 12px 40px;
  -webkit-transition: width 0.4s ease-in-out;
  transition: width 0.4s ease-in-out;
}

input[type=text]:focus {
  width: 35%;
}

form.example button {
  float: left;
  width: 20%;
  padding: 10px;
  background: #2196F3;
  color: white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;
}

form.example button:hover {
  background: #0b7dda;
}

form.example::after {
  content: "";
  clear: both;
  display: table;
}

</style>
</head>
<body>

<p>Animated search form:</p>

<form:form id="search" modelAttribute="search" action="/CRUD/search" method="post">
  <form:input path="query" type="text" name="search" placeholder="Search.." />
  <button type="submit"><i class="fa fa-search"></i></button>
</form:form>

<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th><th>Description</th><th>Rating</th></tr>  
   <c:forEach var="result" items="${list}">   
   <tr>  
   <td>${result.getId()}</td>
   <td>${result.getName()}</td>
   <td>${result.getAddress()}</td>
   </tr>  
   </c:forEach>  
   </table> 
    
   <c:forEach var="dish" items="${dish}">   
   <tr>  
   <td>${dish.getId()}</td>
   <h3><a href = "/CRUD/login">${dish.getName()}</a></h3>
   <td>${dish.getName()}</td>
   </tr>  
   </c:forEach>  

</body>
</html>
--%> 

<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
body {
  font-family: Arial;
}

* {
  box-sizing: border-box;
}

form.example input[type=text] {
  padding: 10px;
  font-size: 17px;
  border: 1px solid grey;
  float: left;
  width: 80%;
  background: #f1f1f1;
}

form.example button {
  float: left;
  width: 20%;
  padding: 10px;
  background: #2196F3;
  color: white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none;
  cursor: pointer;
}

form.example button:hover {
  background: #0b7dda;
}

form.example::after {
  content: "";
  clear: both;
  display: table;
}
</style>
<body class="w3-light-grey">

<!-- w3-content defines a container for fixed size centered content, 
and is wrapped around the whole page content, except for the footer in this example -->
<div class="w3-content" style="max-width:1400px">

<form:form id="search" modelAttribute="search" action="/CRUD/search" method="post" style="margin:auto;max-width:300px">
  <form:input path="query" type="text" name="search" placeholder="Search.." />
  <button type="submit"><i class="fa fa-search"></i></button>
</form:form>

<!-- Grid -->
<div class="w3-row">
	<c:forEach var="dish" items="${dish}"> 
<!-- Blog entries -->
<div class="w3-col l8 s12">
  <!-- Blog entry -->
  <div class="w3-card-4 w3-margin w3-white">
    <img src="/w3images/woods.jpg" alt="Nature" style="width:100%">
    <div class="w3-container">
      <h3><b>${dish.getName()}</b></h3>
      <h5>${dish.getDescription()}, <span class="w3-opacity">April 7, 2014</span></h5>
    </div>

    <div class="w3-container">
      <p>Price : Rs ${dish.getPrice()}</p>
    </div>
  </div>
  <hr>
<!-- END BLOG ENTRIES -->
</div>
 </c:forEach>  
<!-- END GRID -->
</div><br>

<div class="w3-row">
	<c:forEach var="result" items="${list}">    
<!-- Blog entries -->
<div class="w3-col l8 s12">
  <!-- Blog entry -->
  <div class="w3-card-4 w3-margin w3-white">
    <img src="/w3images/woods.jpg" alt="Nature" style="width:100%">
    <div class="w3-container">
      <h3><b>${result.getName()}</b></h3>
      <h5>${result.getAbout()}, <span class="w3-opacity">April 7, 2014</span></h5>
    </div>

    <div class="w3-container">
      <p>>${result.getAddress()}</p>
    </div>
    <c:forEach var="dish" items="${result.getDishes()}"> 
<!-- Blog entries -->
  <!-- Blog entry -->
  <div class="w3-card-4 w3-margin w3-white">
    <img src="/w3images/woods.jpg" alt="Nature" style="width:100%">
      <h3><b>${dish.getName()}</b></h3>
      <h5>${dish.getDescription()}, <span class="w3-opacity">April 7, 2014</span></h5>
      <p>Price : Rs ${dish.getPrice()}</p>
  </div>
  <hr>
<!-- END BLOG ENTRIES -->
 </c:forEach>
  </div>
  <hr>
<!-- END BLOG ENTRIES -->
</div>
 </c:forEach>  
<!-- END GRID -->
</div><br>

<!-- END w3-content -->
</div>

<!-- Footer -->

</body>
</html>

