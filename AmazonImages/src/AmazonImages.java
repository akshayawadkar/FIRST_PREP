import java.util.HashMap;
import java.util.Map;

public class AmazonImages {

	
	Map<User, Directory> users;
	
	public AmazonImages() {
		users = new HashMap<User, Directory>();
	}
	
	public void addUser(User user) {
		
		Directory root = new Directory("Main", null); 
		users.put(user, root);
	}
	
	
	
	public Directory removeUser(User user) {
		return users.remove(user);
	}
	
	public void addImage(Image image, User user) {
		 users.get(user).addEntry(image);
	}
	
	
	 
}
