import java.util.LinkedList;
import java.util.List;

public class GlobalController implements OutsideController{

	
	private List<Elevator> elevators;
	private LinkedList<Integer> floorQueue;
	
	public GlobalController(List<Elevator> elevators) {
		this.elevators = elevators;
		this.floorQueue = new LinkedList<Integer>();
	}
	 
	public void add(int floor) { 
		
		if(!floorQueue.isEmpty()) {
			floorQueue.add(floor);
		}else {
			for(Elevator elevator : elevators) {
				if(elevator.isIdle()) {
					elevator.addInQueue(floor);
				}
			}
		}
		
	}

}
