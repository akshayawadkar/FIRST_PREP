
public class Book {

	private int bookId;
	private String deatils;
	
	public Book(int bookId, String details) {
		this.bookId = bookId;
		this.deatils = details;
	}
	
	public void update() {
		
	}
	
	public int getId() {
		return this.bookId;
	}
	
	public void setId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getDetails() {
		return this.deatils;
	}
	
	public void setDeatils(String details) {
		this.deatils = details;
	}
	
	
}
