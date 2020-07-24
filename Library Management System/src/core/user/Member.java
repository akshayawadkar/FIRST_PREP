package core.user;

import java.util.Date;

import core.book.Book;
import core.book.BookItem;
import core.book.BookReservation;
import core.constants.Constants;
import core.enums.ReservationStatus;

public class Member extends Account{

	private Date dateOfMembership;
	private int totalBooksCheckedout;
	private int getTotalBooksCheckout() {
		return 0;
	}
	
	public boolean reserveBookItem(BookItem bookItem) {
		return false;
	}
	
	private void incrementTotalBooksCheckedout() {
		
	}
	
	public boolean checkoutBookItem(BookItem bookItem) {
		if(this.getTotalBooksCheckout() >= Constants.MAX_BOOKS_ISSUED_TO_A_USER ) {
			System.out.println("This user has already checked out max books");
			return false;
		}
		
		BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
		if(bookReservation != null && bookReservation.getMemberId() != this.getId()) {
			System.out.println("this book is reserved by some other user");
			return false;
		}else if(bookReservation != null) {
			bookReservation.setStatus(ReservationStatus.COMPLETED);
	
		}
		
		if(!bookItem.checkout(this.getId())){
			return false;
		}
		
		this.incrementTotalBooksCheckedout();
		return true;
	}
	
	
}
