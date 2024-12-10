

package library.servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import library.Cart;

@WebServlet("/addCart")
public class AddCart extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();

        try {
            String bookIdParam = request.getParameter("bookId");
            if (bookIdParam == null || bookIdParam.isEmpty()) {
                response.getWriter().println("<h1>Invalid book ID</h1>");
                return;
            }

            int borrowedBook = Integer.parseInt(bookIdParam);


            ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("borrowedList");
            if (cartList == null) {
                cartList = new ArrayList<>();
                session.setAttribute("borrowedList", cartList);
            }

            //  if the item already exists 
            boolean exists = false;
            for (Cart item : cartList) {
                if (item.getBookId() == borrowedBook) {
                    exists = true;
                    item.setQuantity(item.getQuantity());
                    break;
                }
            }

            // Add new item if it doesn't exist
            if (!exists) {
                Cart newItem = new Cart();
                newItem.setBookId(borrowedBook);
                newItem.setQuantity(1);
                cartList.add(newItem);
            }

            response.sendRedirect("Cart.jsp");
        } catch (NumberFormatException e) {
            response.getWriter().println("<h1>Invalid book ID format</h1>");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<h1>An error occurred while processing your request</h1>");
        }
    }
}
