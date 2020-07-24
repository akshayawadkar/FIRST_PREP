
public class Test {

	
	public static void main(String[] args) {
		
		
		int size = 10;
		CircularArray<String> array = new CircularArray<String>(10);
		
		for(int i = 0; i < size; i++) {
			array.set(i, String.valueOf(i));
		}
		
		array.roatate(3);
		
		
		System.out.println();
		
		for(int i = 0; i < size; i++) {
			System.out.print(array.get(i)+" ");
		}
	}
}
