
class CircularArray<T>{
	T[] data;
	int size;
	int head;
	
	public CircularArray(int size) {
		this.size = size;
		data = (T[]) new Object[size];
		head = 0;
	}
	
	
	public void add(T item, int index) {
		data[helper(index)] = item;
	}
	
	public T get(int index) {
		return data[helper(index)];
	}
	
	public void rotate(int rotations) {
		head = helper(rotations);
	}
	
	
	public int helper(int index) {
		if(index < 0) {
			index = index + size;
		}
		
		return (head + index) % size;
	}
}

public class Test {

	
	public static void main(String[] args) {
		
		CircularArray<Integer> arr = new CircularArray(5);
		for(int i = 0; i < arr.size; i++) {
			arr.add(i, i);
		}
		
		arr.rotate(2);
		
		for(int i = 0; i < arr.size; i++) {
			System.out.println(arr.get(i));
		} 
	
	}
	
}
