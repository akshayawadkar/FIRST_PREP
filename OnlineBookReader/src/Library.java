import java.util.Map;

public class Library {

	
	private Map<Integer, Book> books;
	
	
	public Book addBook(int bookId, String bookDetails) {
		if(books.containsKey(bookId)) {
			return null;
		}
		
		Book book = new Book(bookId, bookDetails);
		books.put(bookId, book);
		return book;
		
	}
	
	
	public boolean removeBook(Book book) {
		return removeBook(book.getId());
	}
	
	public boolean removeBook(int bookId) {
		if(!books.containsKey(bookId)) {
			return false;
		}
		
		books.remove(bookId);
		return true;
	}
	
	public Book find(int id) {
		return books.get(id);
	}
}
