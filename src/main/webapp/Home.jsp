
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="all_component/bootstrap.jsp" %>
<title>Home</title>
</head>
<body>
<%@include file="all_component/Navbar.jsp" %>

<div class="container">
<h1 class="my-3" style="color: #795548"> Hi <%= session.getAttribute("name") != null ? session.getAttribute("name") : "Guest" %>   <i class="fa fa-hand-peace-o mx-2" aria-hidden="true"></i></h1>
<h3 class="my-3">#MyLibrary Books</h1>
<table class="container table">
  <thead>
    <tr>
      <th scope="col">#</th>
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
      <td>1</td>
      <td>Romeo Juliet</td>
      <td>Shakespare</td>
      <td>3</td>
      <td> <button>Borrowed</button></td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>2</td>
      <td>Half GirlFriend</td>
      <td>Chatan Bhagat</td>
      <td>5</td>
      <td> <button>Borrowed</button></td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>3</td>
      <td>Half GirlFriend</td>
      <td>Chatan Bhagat</td>
      <td>3</td>
      <td> <button>Borrowed</button></td>
    </tr>
  </tbody>
</table>

</div>

</body>
</html>