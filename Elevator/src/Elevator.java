import java.util.LinkedList;

public class Elevator implements ElevatorInterface{

	private int maxFloor;
	private int minFloor;
	private int currentFloor;
	private LinkedList<Integer> floorQueue;
	private int maxCapacity;
	
	public Elevator(int maxFloors, int minFloors, int maxCapacity) {
		this.minFloor = minFloors;
		this.maxFloor = maxFloors;
		this.maxCapacity = maxCapacity;
		this.currentFloor = 0;
		this.floorQueue = new LinkedList<Integer>();
	}
	 
	public int getMax() {
	 
		return maxFloor;
	}

	 
	public int getMin() {
		 
		return minFloor;
	}

	
	public void moveUp() {
		if(currentFloor == maxFloor) {
			throw new RuntimeException("Not valid floor");
		}
		if(!isFull()) {
			currentFloor++;
		}
		
	}

	
	public void moveDown() {
		  if(currentFloor == minFloor) {
			  throw new RuntimeException("Not valid floor");
		  }
		  
		  if(!isFull()) {
			  currentFloor--;
		  }
		
	}

	
	public void moveNext() {
		
		if(floorQueue.isEmpty()) {
			return;
		}
		
		int dest = floorQueue.peek();
		if(dest > currentFloor) {
			moveUp();
		}else {
			moveDown();
		}
		
		if(dest == currentFloor) {
			floorQueue.poll();
			return;
		}
		
	}

	
	public LinkedList<Integer> getQueue() {
		 
		return floorQueue;
	}

	
	public void addInQueue(int floor) {
		 floorQueue.addFirst(floor);
		
	}

	
	public boolean isFull() {
		 
		return false;
	}

	
	public boolean isIdle() {
		 
		return floorQueue.isEmpty();
	}

	
	public int getCurrentFloor() {
		 
		return this.currentFloor;
	}

}
