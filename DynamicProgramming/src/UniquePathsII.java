import java.util.Arrays;

public class UniquePathsII{
	
	static int[][] dp;
	public static void main(String[] args) {
		int[][] grid = {{0, 0, 0},
						{0, 1, 0},
						{0, 0, 0}};
		
	 
		
		System.out.println(solve(grid));
	}

	private static int solve(int[][] grid) {
		
		dp = new int[grid.length + 1][grid[0].length + 1];
		for(int[] ar : dp) {
			Arrays.fill(ar, -1);
		}
		 
		return solve(grid, grid.length, grid[0].length);
	}

	private static int solve(int[][] grid, int m, int n) {
		
		if(dp[m][n] != -1) {
			return dp[m][n];
		}

		if(m == 0 || n == 0) {
			return 0;
		}
		 

		if(grid[m - 1][n - 1] == 1) {
			return 0;
		}
		
		
		if(m == 1 && n == 1) {
			return 1;
		}
		
		 
		return dp[m][n] = solve(grid, m - 1, n) + solve(grid, m, n - 1);
	}
}