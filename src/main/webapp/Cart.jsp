<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Data</title>
<%@include file="all_component/bootstrap.jsp" %>
</head>
<body>
<%@include file="all_component/Navbar.jsp" %>

<div class="container my-3" >
	<h1 class="my-3" style="color: #795548"><i class="fa fa-book" aria-hidden="true"></i> Book Borrowed by <%= session.getAttribute("name") != null ? session.getAttribute("name") : "Guest" %> </h1>
	
	<table class="container table my-3">
	  <thead>
	    <tr>
	      
	      <th scope="col">Book Id</th>
	      <th scope="col">Book Name</th>
	      <th scope="col">Author</th>
	      <th scope="col">Quantity</th>
	      <th scope="col"></th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
	      <th scope="row">1</th>
	      <td>Romeo Juliet</td>
	      <td>Shakespare</td>
	      <td>3</td>
	      <td> <button>Return</button></td>
	    </tr>
	    <tr>
	      <th scope="row">2</th>
	      <td>Half GirlFriend</td>
	      <td>Chatan Bhagat</td>
	      <td>5</td>
	      <td> <button>Return</button></td>
	    </tr>
	    
	  </tbody>
	</table>
	
</div>

</body>
</html>