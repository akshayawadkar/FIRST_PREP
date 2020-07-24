package org.management;

import java.util.ArrayList;
import java.util.List;

import org.hotel.Hotel;
import org.hotel.Room;
import org.user.Member;

public class BookingManagement {

	private String bookingId;
	private Member user;
	private Hotel hotel;
	private List<Room> bookedRooms;
	private PaymentStatus paymentStatus;
	private Duration duration;
	
	public BookingManagement(String bookingId, Member user, Hotel hotel, List<Room> bookedRooms, Duration duration) {
		this.bookingId = bookingId;
		this.user = user;
		this.hotel = hotel;
		bookedRooms = new ArrayList<>(bookedRooms);
		this.duration = duration;
		
	
	}
	
	public boolean confirmAvailability(List<Room> rooms) {
	
		
		return true;
	}
	
}
