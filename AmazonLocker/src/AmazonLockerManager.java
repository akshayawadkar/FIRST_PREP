import java.util.*;

public class AmazonLockerManager {
	
	
	List<LockerManager> managers;
	
	public AmazonLockerManager(int length) {
		managers = new ArrayList<>();
		
		for(int i = 1; i <= length; i++) {
			managers.add(new LockerManager(i));
		}
		
	}

	public void addLockerManager(LockerManager manager) {
		managers.add(manager);
	}
	
	
	public void removeLockerManager(LockerManager manager) {
		managers.remove(manager);
	}
	
	
	public LockerManager getLockerManager(int id) {
		return managers.get(id);
	}
	
	
	
	
	
}
