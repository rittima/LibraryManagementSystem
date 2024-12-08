
<%@page import="java.sql.*"%>

<%
    // Database connection variables
    String url = "jdbc:oracle:thin:@localhost:1521:oracledb";
    String user = "system";
    String password = "hpsystem";

    // JDBC objects
    Connection connect = null;
    Statement st = null;
    ResultSet book = null;

    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
		connect = DriverManager.getConnection(url, user, password);
		st = connect.createStatement();
        
		book = st.executeQuery("SELECT * FROM BOOK");
%>

<table class="table table-hover">
    
    <thead >
        <tr>
            <th scope="col">#</th>
            <th scope="col">Book Name</th>
            <th scope="col">Author</th>
            <th scope="col">Quantity</th>
            <th scope="col"></th>
        </tr>
    </thead>
    <tbody>
        <% while (book.next()) { %>
        <tr>
            <th scope="row"><%= book.getInt(1) %></th>
            <td><%= book.getString(2) %></td>
            <td><%= book.getString(3) %></td>
            <td ><%= book.getInt(4) %></td>
            <td>
            	<button  style="background: #795548" type="button" class="btn btn-dark"><i class="fa fa-plus mx-1" aria-hidden="true"></i>Borrow</button>
            </td>
        </tr>
        <% } %>
    </tbody>
</table>

<%
    } catch (Exception e) {
        // Handle exceptions (log or display a user-friendly message)
        out.println("<p>Error: " + e.getMessage() + "</p>");
    } finally {
        // Close resources
        if (book != null) try { book.close(); } catch (SQLException ignore) {}
        if (st != null) try { st.close(); } catch (SQLException ignore) {}
        if (connect != null) try { connect.close(); } catch (SQLException ignore) {}
    }
%>






