package org.parking;

import org.vehicle.Vehicle;
import org.vehicle.VehicleSize;

public class Level {
	 
	int floor;
	ParkingSpot[] spots;
	int availableSpots = 0;
	static final int SPOTS_PER_ROW = 10;
	 
	public Level(int floor, int numberSpots) {
		this.floor = floor;
		spots  = new ParkingSpot[numberSpots];
		
		int largeSpots = numberSpots / 4;
		int bikeSpots = numberSpots / 4;
		int compactSpots = numberSpots - largeSpots - bikeSpots;
		
		for(int i = 0; i < numberSpots; i++) {
			VehicleSize size = VehicleSize.MOTORCYCLE;
			if(i < largeSpots) {
				size = VehicleSize.LARGE;
			}else if(i > largeSpots) {
				size = VehicleSize.COMPACT;
			}
			
			int row = i / SPOTS_PER_ROW;
			spots[i] = new ParkingSpot(this, row, i, size);
				
		}
		
		availableSpots = numberSpots;
		
		
		
	}
	
	public int availableSpots() {
		return availableSpots;
	}
	
	public boolean parkVehicle(Vehicle vehicle) {
		if(availableSpots < vehicle.getSpotNeeded()) {
			return false;
		}
		
		int spotNumber = findAvaialbleSpots(vehicle);
		if(spotNumber < 0) {
			return false;
		}
		
		return parkStartingAtSpot(spotNumber, vehicle);
	}
	
	
	public int findAvaialbleSpots(Vehicle vehicle) {
		int spotsNeeded = vehicle.getSpotNeeded();
		int lastRow = -1;
		int spotsFound = 0;
		
		for(int i = 0; i < spots.length; i++) {
			ParkingSpot spot = spots[i];
			if(lastRow != spot.getRow()) {
				spotsFound = 0;
				lastRow = spot.getRow();
			}
			
			if(spot.canFitVehicle(vehicle)) {
				spotsFound++;
			}else {
				spotsFound = 0;
			}
			
			if(spotsFound == spotsNeeded) {
				return i - (spotsNeeded - 1);
			}
		}
		
		return -1;
	}
	
	
	public boolean parkStartingAtSpot(int spotNumber, Vehicle vehicle) {
		vehicle.clearSpots();
		boolean success = true;
		
		for(int i = spotNumber; i < spotNumber + vehicle.getSpotNeeded(); i++) {
			success = success && spots[i].park(vehicle);
		}
		availableSpots -= vehicle.getSpotNeeded();
		
		return success;
	}
	
	public void print() {
		int lastRow = -1;
		for (int i = 0; i < spots.length; i++) {
			ParkingSpot spot = spots[i];
			if (spot.getRow() != lastRow) {
				System.out.print("  ");
				lastRow = spot.getRow();
			}
			spot.print();
		}
	}
	
	/* When a car was removed from the spot, increment availableSpots */
	public void spotFree() {
		availableSpots++;
	}

}
