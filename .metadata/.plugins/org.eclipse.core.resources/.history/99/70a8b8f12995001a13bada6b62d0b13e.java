package org.reservation;

import java.util.Date;

public class BookReservation {

	private Date creatioNdate;
	private ReservationStatus status;
	private String bookItemBarcode;
	private String memberId;
	
	public static BookReservation fetchReservationDetails(String barcode);
}
