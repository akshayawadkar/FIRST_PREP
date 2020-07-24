import java.util.Arrays;

public class LCS {

	
	static int[][] dp;
	public static void main(String[] args) {
		String X = "abcdef", Y = "xgfncdehs"; //4
		dp = new int[X.length() + 1][Y.length() + 1];
		for(int[] ar : dp) {
			Arrays.fill(ar, -1);
		}
		System.out.println(solve(X, Y, X.length(), Y.length()));
		 
		matrix(X, Y);
	}

	private static void matrix(String X, String Y) {
		
		int[][] dp = new int[X.length() + 1][Y.length() + 1];
		
		for(int i =  1; i <= X.length(); i++) {
			for(int j = 1; j <= Y.length(); j++) {
				if(X.charAt(i - 1) == Y.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		
		for(int[] arr : dp) {
			System.out.println(Arrays.toString(arr));
		}
	}

	private static int solve(String x, String y, int m, int n) {
		
		if(dp[m][n] != -1) {
			return dp[m][n];
		}
		
		if(m == 0 || n == 0) {
			return 0;
		}
		
		if(x.charAt(m - 1) == y.charAt(n - 1)) {
			return dp[m][n] = 1 + solve(x, y, m - 1, n - 1);
		}else {
			return dp[m][n] = Math.max(solve(x, y, m - 1, n), solve(x, y, m, n - 1));
		}
	}
	 
}
