
public class Image extends Entry{
	
	private String content;
	private int size;
	
	
	public Image(String fileName, Directory parent, int size, String content) {
		super(fileName, parent);
		this.size = size;
		this.content = content;
	}
	
	
	public String getImage() {
		return this.content;
	}
	
	public int getSize() {
		return this.size;
	}
	

}
