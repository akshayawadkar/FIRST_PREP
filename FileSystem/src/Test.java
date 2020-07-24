
public class Test {

	public static void main(String[] args) {
		
		
		
		Directory root = new Directory("Root", null);
		File one = new File("one", root, 2);
		File two = new File("two", root, 2);
		File three = new File("three", root, 2);
		
		
		root.addEntry(one);
		root.addEntry(two);
		root.addEntry(three);
		
		
		Directory subRoot = new Directory("Subroot", root);
		File four = new File("four", subRoot, 2);
		File five = new File("five", subRoot, 2);
		File six = new File("six", subRoot, 2);
		
		
		root.addEntry(four);
		root.addEntry(five);
		root.addEntry(six);
		
		
		System.out.println(six.getPath());
		System.out.println(root.numberOfFiles());
		
	}
	
}
