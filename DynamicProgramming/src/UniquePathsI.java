import java.util.Arrays;

public class UniquePathsI {

	static int[][] dp;
	public static void main(String[] args) {
		
		int m = 3, n = 3;
		dp = new int[m + 1][n + 1];
		
		for(int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		
		System.out.println(solve(m, n));
	}

	private static int solve(int m, int n) {
		
		if(dp[m][n] != -1) {
			return dp[m][n];
		}
		
		if(m == 0 || n == 0) {
			return dp[m][n] = 0;
		}
		
		if(m == 1 && n == 1) {
			return dp[m][n] = 1;
		}
		 
		
		return dp[m][n] = solve(m - 1, n) + solve(m, n - 1);
	}
}

//
//
//public class Test {
//
//	
//	public static void main(String[] args) {
//		
//		int m  = 3, n = 3; //28
//		
//		System.out.println(solve(0, 0 , m - 1, n - 1));
//		System.out.println(solve2(m - 1, n - 1));
//		
//	}
//
//	private static int solve2(int m, int n) {
//	 
//		if(m == 0 || n == 0) {
//			return 1;
//		}
//		
//		return solve2(m - 1, n) + solve2(m, n - 1);
//	}
//
//	private static int solve(int x, int y, int m, int n) {
//		
//		 if(x == m && y == n) {
//			 return 1;
//		 }
//		 
//		 if(x > m || y > n) {
//			 return 0;
//		 }
//		 
//		 return solve(x + 1, y, m, n) + solve(x, y  + 1, m, n);
//	}
//}



