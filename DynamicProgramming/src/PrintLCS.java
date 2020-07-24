
public class PrintLCS {

	public static void main(String[] args) {
		
		String X = "acbcf", Y = "abcdaf";;
		
		System.out.println(solve(X, Y));
	}

	private static String solve(String X, String Y) {
		
		int[][] dp = new int[X.length() + 1][Y.length() + 1];
		
		for(int i = 1; i <= X.length(); i++) {
			for(int j = 1; j <= Y.length(); j++) {
				if(X.charAt(i - 1) == Y.charAt(j - 1)){
					dp[i][j] = dp[i - 1][j - 1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		
		return printLCS(X, Y, X.length(), Y.length(), dp);
	}

	private static String printLCS(String X, String Y, int m, int n, int[][] dp) {
		
		if(m == 0 || n == 0) {
			return "";
		}
		
		if(X.charAt(m - 1) == Y.charAt(n - 1)) {
			return printLCS(X, Y, m - 1, n - 1, dp) + X.charAt(m - 1);
		}
		
		if(dp[m - 1][n] > dp[m][n - 1]) {
			return printLCS(X, Y, m - 1, n, dp);
		}else {
			return printLCS(X, Y, m, n - 1, dp);
		}
	
	}
}
