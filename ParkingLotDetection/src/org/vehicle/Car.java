package org.vehicle;

import org.parking.ParkingSpot;

public class Car extends Vehicle{

	@Override
	public void print() {
		System.out.println("This parking is for Car");
		
	}

	@Override
	public boolean canFitInASpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return spot.getSize() == VehicleSize.LARGE || spot.getSize() == VehicleSize.COMPACT;
	}

}
