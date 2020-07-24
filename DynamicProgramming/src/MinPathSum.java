import java.util.Arrays;

public class MinPathSum{
	
	static int[][] dp;
	public static void main(String[] args) {
		
		int[][] arr = {{1, 3, 1},
					   {1, 5, 1},
					   {4, 2, 1}};
		
		System.out.println(solve(arr));
		
		for(int[] ar : dp) {
			System.out.println(Arrays.toString(ar));
		}
		
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
			return Integer.MAX_VALUE;
		}
		
		if(m == 1 && n == 1) {
			return grid[m - 1][n - 1];
		}
		
		return dp[m][n] = Math.min(solve(grid, m - 1, n), 
				solve(grid, m, n - 1)) + grid[m - 1][n - 1];
	}
	
}