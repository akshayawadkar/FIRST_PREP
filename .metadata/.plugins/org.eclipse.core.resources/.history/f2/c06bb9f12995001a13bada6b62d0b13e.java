package org.user;

public class Librarian extends Account{

	public boolean addBook(BookItem bookItem);
	public boolean removeBook(BookItem bookItem);
	
	public boolean blockUser(Member member);
	public boolean unblockUser(Member member);
}
