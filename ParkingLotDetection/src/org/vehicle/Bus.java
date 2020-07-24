package org.vehicle;

import org.parking.ParkingSpot;

public class Bus extends Vehicle{

	@Override
	public void print() {
		 
		System.out.println("This is parking for Bus");
	}

	@Override
	public boolean canFitInASpot(ParkingSpot spot) {
		return spot.getSize() == VehicleSize.LARGE;
	}

}
