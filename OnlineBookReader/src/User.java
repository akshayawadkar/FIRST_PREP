
public class User {

	private int userId;
	private String details;
	private int accountType;
	
	
	public User(int userId, String deatils, int accountType) {
		this.userId = userId;
		this.details = details;
		this.accountType = accountType;
	}
	
	
	public void setId(int id) {
		this.userId = id;
	}
	
	public int getId() {
		return this.userId;
	}
	
	
	
	public void setUserDetails(String userDetails) {
		this.details = userDetails;
	}
	
	public String getUserDeatils() {
		return this.details;
	}
	
	
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	
	public int getAccountType() {
		return this.accountType;
	}
	
	
	
	
	
	
	public void renewMembership() {
		
	}
	
	
	
	
}
