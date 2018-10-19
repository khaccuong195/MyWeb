<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Product List</title>
 </head>
 <body>
 
    <jsp:include page="../_header.jsp"></jsp:include>
    <jsp:include page="../_menu.jsp"></jsp:include>
 
    <h3>Danh sach nha san xuat</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Id</th>
          <th>Name</th>
          <th>Edit</th>
          <th>Delete</th>
       </tr>
       <c:forEach items="${listNSX}" var="nsx" >
          <tr>
             <td>${nsx.id}</td>
             <td>${nsx.tennsx}</td>
             <td>
                <a href="EditNhaSanXuat?id=${nsx.id}">Edit</a>
             </td>
             <td>
                <a href="DeleteNhaSanXuat?id=${nsx.id}">Delete</a>
             </td>
          </tr>
       </c:forEach>
    </table>
 
    <a href="${pageContext.request.contextPath}/CreateNhaSanXuat" >Create Nha San Xuat</a>
 
    <jsp:include page="../_footer.jsp"></jsp:include>
 
 </body>
</html>