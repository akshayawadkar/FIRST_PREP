
public class Cell {
	
	int row;
	int col;
	boolean isBomb;
	int number;
	boolean isExposed = false;
	boolean isGuess = false;
	
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
		this.isBomb = false;
		this.number = 0;
	}
	
	
	public void setBomb(boolean bomb) {
		this.isBomb = bomb;
		this.number = -1;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	boolean getBlank() {
		return number == 0; 
	}
	
	public boolean flip() {
		isExposed = true;
		return !isBomb;
	}
	
	
	
}
