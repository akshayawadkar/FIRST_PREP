package org.reservation;

import java.util.Date;

public class BookLending {
	
	private Date creationdate;
	private Date duedate;
	private Date returndate;
	private String bookItemBarcode;
	private String memberId;
	
	public static void lendBook(String barcode, String memberId);
	private static BookLending fetchLendingDetails(String barcode);
	
	
}
