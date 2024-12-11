package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SummaryDao {

	private Connection connect;
	private String query;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public SummaryDao(Connection connect) {
		this.connect = connect;
	}
	
	public boolean insertBookSummary(Sumarry model) {
		boolean result = false;
		try {
			query = "insert into BookSummary(borrowed_id, u_id, b_quantity, b_date) values(?,?,?,?)";
			pst=this.connect.prepareStatement(query);
			pst.setInt(1, model.getBorrowedId());
			pst.setString(2, model.getUid());
			pst.setInt(3, model.getQuantity());
			pst.setString(4, model.getBorrowDate());
			
			pst.executeUpdate();
			result=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
	
//	public List<Sumarry> userBorrowedList(int id) {
//		ArrayList<Sumarry> summaries = new ArrayList<>();
//		try {
//			query = "select * from booksummary where u_id=? summary by booksummary.b_id desc";
//			pst = this.connect.prepareStatement(query);
//			pst.setInt(1, id);
//			rs= pst.executeQuery();
//			
//			while (rs.next()) {
//				Sumarry data = new Sumarry();
//				BookCrontroller pc=new BookCrontroller(connect);
//				int 
//				
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return summaries;
//	}
	
	
}
