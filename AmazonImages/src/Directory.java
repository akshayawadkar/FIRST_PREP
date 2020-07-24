import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry{

	protected List<Entry> subEntries;
	
	public Directory(String fileName, Directory parent) {
		super(fileName, parent);
	}
	
	public void addEntry(Entry entry) {
		subEntries.add(entry);
	}
	
	public boolean removeEntry(Entry entry) {
		return subEntries.remove(entry);
	}
	
	public int getSize() {
		int size = 0;
		
		for(Entry entry : subEntries) {
			
			if(entry instanceof Image) {
				size += entry.getSize();
			}else {
				Directory d = (Directory) entry;
				size += d.getSize();
			}
			
		}
		
		return size;
	}
	
	public List<Image> getAllImages(){
		List<Image> images = new ArrayList<>();
		
		for(Entry entry : subEntries) {
			if(entry instanceof Image) {
				images.add((Image) entry);
			}else {
				
				Directory d = (Directory) entry;
				images.addAll(d.getAllImages());
			}
		}
		
		
		return images;
	}
	
	public List<Image> getImagesInCurrentDirectory(){
		List<Image> images = new ArrayList<>();
		
		for(Entry entry : subEntries) {
			if(entry instanceof Image) {
				images.add((Image) entry);
			}
		}
		
		
		return images;
	}
	
}
