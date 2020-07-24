
public class Locker {
	
	
	private int lockerId;
	private String password;
	private LockerType lockerType;
	private Address address;
	private Item item;
	private boolean isAvialble;
	
	public Locker(int lockerId, LockerType lockerType) {
		this.lockerId = lockerId;
		this.lockerType = lockerType;
		this.isAvialble = true;
	}
	
	
	public void setIsAvailable(boolean available) {
		this.isAvialble = available;
	}
	
	public boolean getIsAvailable() {
		return this.isAvialble;
	}
	
	public LockerType getLockerType() {
		return this.lockerType;
	}
	
	public int getLockerId() {
		return this.lockerId;
	}
	
	private void setPassword(String password) {
		this.password = password;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public Item getItem() {
		return this.item;
	}
	
	

}
