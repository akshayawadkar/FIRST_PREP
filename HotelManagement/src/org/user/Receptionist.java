package org.user;

import org.hotel.Room;

public class Receptionist extends Member{

	
	public boolean createBooking() {
		return false;
	}
	
	public boolean addRoomCharge(Room room, Member user) {
		return false;
	}
}
