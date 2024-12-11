package library.servlet;

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
import library.DBConnect;
import library.Sumarry;
import library.SummaryDao;


@WebServlet("/BookSummary")
public class BookSummary extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession();
//		
//		try (PrintWriter out = response.getWriter())
//		{
//	        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//	        Date date =new Date();
//	        
//	        // retrive all books in the cart
//	        ArrayList<Cart> borrowedList = (ArrayList<Cart>) session.getAttribute("borrowedList");
//	        String auth = (String) request.getSession().getAttribute("name");
//	        
//	        if (auth == null) {
//                // Redirect to login if user is not authenticated
//                response.sendRedirect("login.jsp");
//                return;
//            }
//
//            if (borrowedList != null && !borrowedList.isEmpty()) {
//                ArrayList<Sumarry> summaries = new ArrayList<>();
//                
//                for (Cart cart : borrowedList) {
//                	Sumarry summary = new Sumarry();
//                    summary.setBookId(cart.getBookId());
//                    summary.setUid(auth); 
//                    summary.setQuantity(cart.getQuantity());
//                    summary.setBorrowDate(format.format(date)); // Store current date 
//
//                    SummaryDao odao= new SummaryDao(DBConnect.getConnection());
//                    boolean result = odao.insertBookSummary(summary);
//                    if (!result) { break; }
//                }
//                session.setAttribute("summaries", summaries);
//                response.sendRedirect("Summary.jsp");
//                borrowedList.clear();
//            }
//	        else {
//				if (auth== null) {
//					response.sendRedirect("login.jsp");
//					response.sendRedirect("cart.jsp");
//				}
//			}
//	        
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	        response.getWriter().println("<h1>An error occurred while processing your request</h1>");
//	    }
//
//	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()){
			out.println("book servlet");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
}

