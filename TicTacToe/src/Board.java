
public class Board {
	
	int rows;
	int cols;
	Cell[][] board;
	
	
	public Board(int dimension) {
		this.rows = dimension;
		this.cols = dimension;
		board = new Cell[rows][cols];
	}
	
	public void initializeBoard() {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				board[i][j] = new Cell(i, j, 0);
			}
		}
	}
	
	
	public void printBoard() {
		
	}
	
	
	public void place(int row, int col, int player) {
		board[row][col] = new Cell(row, col, player);
	}
	
	
	public int getPlayer(int row, int col) {
		return board[row][col].getValue();
	}
	

}
