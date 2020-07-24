
public class Vehicle {

	String licensePlate;
	String spotNumber;
	VehicleType vehicleType;
	Slot slot;
	
	public Vehicle(String licensePlate, VehicleType vehicleType) {
		
		this.licensePlate = licensePlate;
		this.vehicleType = vehicleType;
	}
	
	
	Slot getParkingDetails() {
		return slot;
	}
	
	Slot setParkingDetails(Slot s) {
		slot = s;
		return s;
	}
	
	
}
