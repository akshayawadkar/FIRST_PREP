
public class OnlineReaderSystem {

	private Library library;
	private UserManager userManager;
	private Display display;
	private Book activeBook;
	private User activeUser;
	
	public OnlineReaderSystem() {
		userManager = new UserManager();
		library = new Library();
		display = new Display();
	}
	
	public Library getLibrary() {
		return this.library;
	}
	
	public UserManager getUserManager() {
		return this.userManager;
	}
	
	public Display getDisplay() {
		return display;
	}
	
	public Book getActiveBook() {
		return this.activeBook;
	}
	
	public User getActiveUser() {
		return this.activeUser;
	}
	
	public void setActiveBook(Book book) {
		display.displayBook(book);
		activeBook = book;
	}
	
	public void setActiveUser(User user) {
		activeUser = user;
		display.displayUser(user);
	}
	
	
	
}
