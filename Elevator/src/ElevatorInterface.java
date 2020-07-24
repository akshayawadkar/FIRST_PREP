import java.util.LinkedList;

public interface ElevatorInterface {

	 int getMax();
	 int getMin();
	 void moveUp();
	 void moveDown();
	 void moveNext();
	 LinkedList<Integer> getQueue();
	 void addInQueue(int floor);
	 boolean isFull();
	 boolean isIdle();
	 int getCurrentFloor();
	 
	
}
