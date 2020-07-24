class Test{
	
	
	public static void main(String[] args) {
		
		int[][] arr =  {{-2,-3,3},
						{-5,-10,1},
						{10,30,-5}};
		
		System.out.println(solve(arr, 0, 0));
		System.out.println(solve2(arr, 0, 0));
		
	}

	private static int solve2(int[][] grid, int i, int j) {
		 
		
		if(i >= grid.length || j >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		
		int health = Math.min(solve2(grid, i + 1, j), solve2(grid, i, j + 1));
		
		if(health == Integer.MAX_VALUE) {
			health = 1;
		}
		
		int result = 0;
		
		if(health - grid[i][j] > 0) {
			result = health - grid[i][j];
		}else {
			result = 1;
		}
		
		return result;
	}

	private static int solve(int[][] arr, int m, int n) {
		
		
		if(m >= arr.length || n >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		 
		int health = Math.min(solve(arr, m + 1, n), solve(arr, m, n + 1));
		
		if(health == Integer.MAX_VALUE) {
			health = 1;
		}
		
		int result = 0;
		
		if(health - arr[m][n] > 0 ) {
			result = health - arr[m][n];
		}else {
			result = 1;
		}
		
		return result;
	}
}