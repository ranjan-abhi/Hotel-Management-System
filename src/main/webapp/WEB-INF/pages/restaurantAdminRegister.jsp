<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <title>Register</title>
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
        display: flex;
        justify-content: center;
        align-items: center;
        background: #e6e6e6;
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
        background: #69d2e7;
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
    <div class="wrap">
         <form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
            <div class="form-header">
                <h3>Registration Form</h3>
                <p>Enter your details to register</p>
            </div>
            <!--Email Input-->
            <div class="form-group">
                <form:input path="username" name="username" id="username" type="text" class="form-input" placeholder="Username"/>
            </div>
            <!--Password Input-->
            <div class="form-group">
                <form:input path="password" name="password" id="password" type="password" class="form-input" placeholder="Password" />
            </div>
            
            <div class="form-group">
                <form:input path="firstname" name="firstname" id="firstname" type="text" class="form-input" placeholder="First name" />
            </div>
            
            <div class="form-group">
                <form:input path="lastname" name="lastname" id="lastname" type="text" class="form-input" placeholder="Last Name" />
            </div>
            
            <div class="form-group">
                <form:input path="email" name="email" id="email" type="text" class="form-input" placeholder="Email" />
            </div>
            
            <div class="form-group">
                <form:input path="phone" name="phone" id="phone" type="text" class="form-input" placeholder="Phone" />
            </div>
            <!--Login Button-->
            <div class="form-group">
                <button class="form-button" type="submit">Register</button>
            </div>
            <div class="form-footer">
            Already have an account? <a href="/CRUD/login">Login</a>
            </div>
         </form:form>
    </div><!--/.wrap-->
</body>
</html>
    <%--    <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>

        <body>
            <form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">

                <table align="center">
                    <tr>
                        <td>
                            <form:label path="username">Username</form:label>
                        </td>
                        <td>
                            <form:input path="username" name="username" id="username" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="firstname">FirstName</form:label>
                        </td>
                        <td>
                            <form:input path="firstname" name="firstname" id="firstname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="lastname">LastName</form:label>
                        </td>
                        <td>
                            <form:input path="lastname" name="lastname" id="lastname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="email">Email</form:label>
                        </td>
                        <td>
                            <form:input path="email" name="email" id="email" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="phone">Phone</form:label>
                        </td>
                        <td>
                            <form:input path="phone" name="phone" id="phone" />
                        </td>
                    </tr>

                    <tr>
                        <td></td>
                        <td>
                            <form:button id="register" name="register">Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="/CRUD/login">Login</a>
                        </td>
                    </tr>
                </table>
            </form:form>

        </body>

        </html>
        --%> 