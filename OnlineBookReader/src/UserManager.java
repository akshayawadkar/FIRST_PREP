import java.util.HashMap;

public class UserManager {
	
	private HashMap<Integer, User> users;
	
	
	public User addUser(int id, String deatils, int accountType) {
		if(users.containsKey(id)) {
			return null;
		}
		
		User user = new User(id, deatils, accountType);
		
		users.put(id,  user);
		
		return user;
	}
	
	public boolean removeUser(User user) {
		return removeUser(user.getId());
	}
	
	public boolean removeUser(int id) {
		if(!users.containsKey(id)) {
			return false;
		}
		
		users.remove(id);
		return true;
	}
	
	
	public User find(int id) {
		return users.get(id);
	}
	
	
	

}
