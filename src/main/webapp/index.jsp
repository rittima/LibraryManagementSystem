<%
	if(session.getAttribute("name")==null){
		response.sendRedirect("login.jsp");
	}
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
.back-img{
background: url("img/old-library.jpeg");
width: 100%;
height: 80vh;
background-repeat:no-repeat ;
background-size: cover;

}
</style>

<meta charset="UTF-8">
<title>index</title>
<%@include file="all_component/bootstrap.jsp" %>
</head>
<body>
<%@include file="all_component/Navbar.jsp" %>
<div class="container-fluid back-img" ></div>


</body>
<%@include file="all_component/footer.jsp" %>
</html>