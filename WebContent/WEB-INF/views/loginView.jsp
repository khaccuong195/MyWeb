<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Login</title>
   </head>
   <body>
   
    <div> <jsp:include page="_header.jsp"></jsp:include></div>
      <h3>Login Page</h3>
      <p style="color: red;">${errorString}</p>
 
 	<div class="container">
 	<h1 class="form-heading">login Form</h1>
<div class="login-form">
<div class="main-div" style="width: 38%;">
    <div class="panel">
   <h2>Admin Login</h2>
   <p>Please enter your email and password</p>
   </div>
    <form id="Login" method="POST" class="center" action="${pageContext.request.contextPath}/login">

        <div class="form-group">


            <input type="email" class="form-control" id="inputEmail" placeholder="Email Address" value= "${user.userName}">

        </div>

        <div class="form-group">

            <input type="password" class="form-control" id="inputPassword" placeholder="Password" value= "${user.password}">

        </div>
        <div class="forgot">
        <a href="reset.html">Forgot password?</a>
</div>
        <button type="submit" class="btn btn-primary">Login</button>
        <a href="${pageContext.request.contextPath}/">Cancel</a>
    </form>
    </div>
    </div>
 	<div class="col-md-12">
      <form method="POST" class="center" action="${pageContext.request.contextPath}/login">
         <table border="0">
            <tr>
               <td>User Name</td>
               <td><input type="text" class="form-control" name="userName" value= "${user.userName}" /> </td>
            </tr>
            <tr>
               <td>Password</td>
               <td><input type="text" class="form-control" name="password" value= "${user.password}" /> </td>
            </tr>
            <tr>
               <td>Remember me</td>
               <td><input type="checkbox" class="form-control" name="rememberMe" value= "Y" /> </td>
            </tr>
            <tr>
               <td colspan ="2">
                  <input type="submit" class="btn btn-primary" value= "Submit" />
                  <a href="${pageContext.request.contextPath}/">Cancel</a>
               </td>
            </tr>
         </table>
      </form>
      </div>
 </div>
      <p style="color:blue;"></p>
 
      <jsp:include page="_footer.jsp"></jsp:include>
   </body>
</html>