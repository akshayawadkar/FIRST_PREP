import java.util.*;

public class LockerManager {
	
	
	private int managerId;
	private Map<Integer, Locker> lockers;
	private Address address;
	
	public LockerManager(int managerId) {
		this.managerId = managerId;
		initializeLockers();
	}
	
	

	public LockerManager(int managerId, String address) {
		this.managerId = managerId;
		initializeLockers();
	}
	
	private void initializeLockers() {
		// TODO Auto-generated method stub
		
	}
	
	public int getAvailableLockersCount() {
		return 0;
	}
	
	public List<Locker> getAvailableLockers(){
		return new ArrayList<>();
	}
	
	public int getAvailableLockersCount(LockerType type) {
		return 0;
	}
	
	public List<Locker> getAvailableLockers(LockerType type){
		return new ArrayList<>();
	}
	
	
	public Locker getSingleLocker(LockerType type) {
		return null;
	}
	
	
	public boolean getStatus(Locker locker) {
		return true;
	}
	
	
	public Locker fillLocker(LockerType lockerType, Item item) {
		
		return null;
	}
	
	
	
	
	

}
