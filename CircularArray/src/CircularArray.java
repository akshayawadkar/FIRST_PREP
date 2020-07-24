import java.util.Iterator;
 

public class CircularArray<T> implements Iterable<T>{

	private T[] items;
	private int length;
	private int head;
	
	public CircularArray(int length) {
		this.length = length;
		this.items = (T[])new Object[length];	
		head = 0;
	}
	
	public void set(int index, T item) {
		items[convert(index)] = item;
	}
	
	public T get(int index) {
		return items[convert(index)];
		
	}
	
	public void roatate(int rotations) {
		
		head = convert(rotations);
	}
	
	public int convert(int index) {
		
		if(index < 0) {
			index = index + length;
		}
		
		return (head + index) % length;
	}
	
	public int getLength() {
		return length;
	}

	
	public Iterator<T> iterator(){
		return new CircularIterator();
	}
	
	
	private class CircularIterator implements Iterator<T>{
		
		int current = -1;
		
		public CircularIterator() {
			
		}
		
		public boolean hasNext() {
			return current < items.length - 1;
		}
		
		public T next() {
			current++;
			return (T) items[convert(current)];
		}
		
		
		
	}
}


