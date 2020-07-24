
public class Slot {
	
	Vehicle vehicle;
	int spotNumber;
	Level levelNumber;
	
	public Slot(int spotNumber, Level levelNumber) {
		this.spotNumber = spotNumber;
		this.levelNumber = levelNumber;
	}
	
	public boolean addVehicle(Vehicle v) {
		return false;
	}

}
