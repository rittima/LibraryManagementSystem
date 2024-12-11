package library;

public class Sumarry  extends Books{

	private int borrowedId;
	private String uid;
	private int quantity;
	private String borrowDate;
	
	public Sumarry() { }

	public Sumarry(int borrowedId, String uid, int quantity,String borrowDate) {
		super();
		this.borrowedId = borrowedId;
		this.uid = uid;
		this.quantity = quantity;
		this.borrowDate = borrowDate;
	}

	public Sumarry( String uid, int quantity, String borrowDate) {
		super();
		this.uid = uid;
		this.quantity = quantity;
		this.borrowDate = borrowDate;
	}


	public int getBorrowedId() {
		return borrowedId;
	}

	public void setBorrowedId(int borrowedId) {
		this.borrowedId = borrowedId;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	
	@Override
	public String toString() {
		return "Sumarry [borrowedId=" + borrowedId + ", uid=" + uid + ", quantity=" + quantity + ", borrowDate="
				+ borrowDate + "]";
	}	
	
}
