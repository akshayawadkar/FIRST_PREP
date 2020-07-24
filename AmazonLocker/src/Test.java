
public class Test {

	
	public static void main(String[] args) {
		
		Item i = new Item();
		
		AmazonLockerManager amazonManager = new AmazonLockerManager(5);
		
		amazonManager.getLockerManager(0).fillLocker(LockerType.MEDIUM, i);
		
		
	}
}
