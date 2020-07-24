package org.user;

import java.util.Date;

public class Member extends Account{

	private String memberId;
	private Date dateOfMembership;
	private int totalBooksCheckedOut;
	
	public void checkFine();
	public void returnBook(bookItem bookItem);
	public void checkoutbookItem(BookItem bookItem);
	public void renewBookItem(BookItem bookItem);
	
	
	
}
