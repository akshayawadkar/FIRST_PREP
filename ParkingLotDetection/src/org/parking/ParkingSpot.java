package org.parking;

import org.vehicle.Vehicle;
import org.vehicle.VehicleSize;

public class ParkingSpot {

	private Level level;
	private Vehicle vehicle;
	private int row;
	private int spotNumber;
	private VehicleSize size;
	
	public ParkingSpot(Level level, int row, int n, VehicleSize size) {
		this.level = level;
		this.row = row;
		this.spotNumber = n;
		this.size = size;
	}
	
	public boolean isAvailable() {
		return vehicle == null;
	}
	
	public boolean canFitVehicle(Vehicle vehicle) {
		return isAvailable() && vehicle.canFitInASpot(this);
	}
	
	public boolean park(Vehicle v) {
		if(!canFitVehicle(v)) {
			return false;
		}
		
		vehicle = v;
		vehicle.parkInSpot(this);
		return true;
	}
	
	public void removeVehicle() {
		level.spotFree();
		vehicle = null;
	}
	
	public void print() {
		if(vehicle == null) {
			if(size == VehicleSize.COMPACT) {
				System.out.println("C");
			}else if(size == VehicleSize.LARGE) {
				System.out.println("L");
			}else if(size == VehicleSize.MOTORCYCLE) {
				System.out.println("M");
			}else {
				vehicle.print();
			}
		}
	}
	
	

	public Level getLevel() {
		return level;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public int getRow() {
		return row;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public VehicleSize getSize() {
		return size;
	}
	
	
	
}
