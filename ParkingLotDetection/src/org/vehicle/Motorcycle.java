package org.vehicle;

import org.parking.ParkingSpot;

public class Motorcycle extends Vehicle{

	@Override
	public void print() {
		
		System.out.println("This parking is for Motorcycle");
	}

	@Override
	public boolean canFitInASpot(ParkingSpot spot) {
		 
		return true;
	}

}
