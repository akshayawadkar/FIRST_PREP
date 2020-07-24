
public abstract  class Entry {

	
	protected String fileName;
	protected Directory parent;
	protected double dateCreated;
	protected User user;
	
	
	
	public Entry(String fileName, Directory parent) {
		this.parent = parent;
		this.fileName = fileName;
		this.dateCreated = System.currentTimeMillis();
	}
	
	
	public User getUser() {
		return this.user;
	}
	
	public abstract int getSize();
	
}
