
public class Cell {
	
	
	private int rowN;
	private int colN;
	private boolean isOccupied;
	private int val;
	
	public Cell(int row, int col, int player) {
		 this.rowN = row;
		 this.colN = col;
		 this.val = player;
		 
	}
	
	public int getValue() {
		return this.val;
	}

}
