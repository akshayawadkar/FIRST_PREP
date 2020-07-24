package core.user;

import core.book.BookItem;

public class Librarian extends Account{

	public boolean addBookItem(BookItem bookItem) {
		return false;
	}
	
	public boolean removeBookItem(BookItem bookItem) {
		return false;
	}
	
	public boolean blockMember(Member memberId) {
		return false;
	}
	
	public boolean unblockMember(Member memberId) {
		return false;
	}
	
	
	
}
