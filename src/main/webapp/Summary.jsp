<%@page import="library.Sumarry"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <%@include file="all_component/bootstrap.jsp" %>
    <title>Borrowed Book Summary</title>
</head>
<body>
    <%@include file="all_component/Navbar.jsp" %>

    <div class="container my-4">
        <h1 class="text-center text-primary">Borrowed Book Summary</h1>

        <div class="row">
            <% 
                ArrayList<Sumarry> summaries = (ArrayList<Sumarry>) session.getAttribute("summaries");
                if (summaries != null && !summaries.isEmpty()) {
                    for (Sumarry summary : summaries) {
            %>
            <div class="card mx-3 my-3 shadow" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Book ID: <%= summary.getBookId() %></h5>
                    <h6 class="card-subtitle mb-2 text-secondary">User ID: <%= summary.getUid() %></h6>
                    <p class="card-text">
                        <span>Qty: <%= summary.getQuantity() %></span><br>
                        <span>Borrowed: <%= summary.getBorrowDate() %></span><br>
                        <%-- <span>Returned: <%= summary.getReturnDate() != null ? summary.getReturnDate() : "Not Returned Yet" %></span> --%>
                    </p>
                </div>
            </div>
            <% 
                    }
                } else { 
            %>
            <div class="col-12 text-center">
                <h5 class="text-muted">No books borrowed yet or all books returned.</h5>
            </div>
            <% } %>
        </div>
    </div>
</body>
</html>