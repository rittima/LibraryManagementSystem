package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookCrontroller {

	private Connection connect;
	private String query;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public BookCrontroller(Connection connect) {
		this.connect = connect;
	}

    public List<Cart> getBorrowed(ArrayList<Cart> borrowedList) {
        List<Cart> books = new ArrayList<>();
        try {
            if (borrowedList != null && !borrowedList.isEmpty()) {
                for (Cart item : borrowedList) {
                    query = "SELECT * FROM BOOK WHERE BOOKID = ?";
                    pst = this.connect.prepareStatement(query);
                    pst.setInt(1, item.getBookId());
                    rs = pst.executeQuery();

                    while (rs.next()) {
                        Cart row = new Cart();
                        row.setBookId(rs.getInt("bookId"));
                        row.setBookName(rs.getString("bookName"));
                        row.setAuthor(rs.getString("author"));
                        row.setQuantity(item.getQuantity());
                        books.add(row);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return books;
    }
}
