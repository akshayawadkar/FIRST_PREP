package org.vehicle;

import java.util.ArrayList;

import org.parking.ParkingSpot;

public abstract class Vehicle {

	private String lisencePlate;
	private int spotNeeded;
	private VehicleSize size;
	private ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();
	public String getLisencePlate() {
		return lisencePlate;
	}
	
	public abstract void print();
	public abstract boolean  canFitInASpot(ParkingSpot spot);
	
	public void clearSpots() {
		for(int i = 0; i < parkingSpots.size(); i++) {
			parkingSpots.get(i).removeVehicle();
		}
		parkingSpots.clear();
	}
	
	public void parkInSpot(ParkingSpot spot) {
		this.parkingSpots.add(spot);
	}
	
	
	
	
	public void setLisencePlate(String lisencePlate) {
		this.lisencePlate = lisencePlate;
	}
	public int getSpotNeeded() {
		return spotNeeded;
	}
	public void setSpotNeeded(int spotNeeded) {
		this.spotNeeded = spotNeeded;
	}
	public VehicleSize getSize() {
		return size;
	}
	public void setSize(VehicleSize size) {
		this.size = size;
	}
	public ArrayList<ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	public void setParkingSpots(ArrayList<ParkingSpot> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}
	
	
}
