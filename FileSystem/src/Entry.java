
public abstract class Entry {

	
	private String name;
	private Directory parent;
	private long dateCreated;
	private long lastAccessed;
	private long lastUpdate;
	
	
	public Entry(String name, Directory parent) {
		this.name = name;
		this.parent = parent;
		dateCreated = System.currentTimeMillis();
	}
	
	
	public abstract int size();
	
	public String getPath() {
		
		if(parent == null) {
			return name;
		}
		
		
		return parent.getPath() + "/" + name;
	}
	
	public boolean delete() {
		
		if(parent == null) {
			return false;
		}
		
		return parent.deleteEntry(this);
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public long getDateCreated() {
		return dateCreated;
	}
	
	public long getLastAccessed() {
		return lastAccessed;
	}
	
	public long lastUpdate() {
		return lastUpdate;
	}
	 
}
