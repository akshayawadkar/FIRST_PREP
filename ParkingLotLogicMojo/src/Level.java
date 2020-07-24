import java.util.ArrayList;

public class Level {

	ArrayList<Slot> slots;
	int levelNumber;
	
	public Level(int levelNumber, ArrayList<Slot> slots) {
		this.slots = slots;
		this.levelNumber = levelNumber;
	}
}
