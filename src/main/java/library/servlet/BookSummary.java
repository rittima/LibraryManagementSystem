package library.servlet;

import java.awt.print.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import library.Cart;


@WebServlet("/BookSummary")
public class BookSummary extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		try (PrintWriter out = response.getWriter())
		{
	        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	        Date date =new Date();
	        
	        // retrive all books in the cart
	        ArrayList<Cart> borrowedList = (ArrayList<Cart>) session.getAttribute("borrowedList");
            
	        String auth = (String) request.getSession().getAttribute("name");
	        if (borrowedList != null && auth != null) {
				
	        	for (Cart cart : borrowedList) {
					// function korenis
				}
			}
	        else {
				if (auth== null) {
					response.sendRedirect("login.jsp");
					response.sendRedirect("cart.jsp");
				}
			}
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	        response.getWriter().println("<h1>An error occurred while processing your request</h1>");
	    }

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
