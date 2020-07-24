
public class File extends Entry{

	
	private int size;
	private String content;
	
	public File(String name, Directory parent, int size) {
		super(name, parent);
		this.size = size;
	}
	
	public int size() {
		return this.size;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
	
	
}
