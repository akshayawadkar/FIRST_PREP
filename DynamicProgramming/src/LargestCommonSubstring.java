public class LargestCommonSubstring{
	
	
	public static void main(String[] args) {
		
		String X = "abcde", Y = "afdfdbcgde";
//		String X = "abcde", Y = "fgcdfgr";
		
		System.out.println(solve(X, Y, X.length(), Y.length(), 0));
		System.out.println(solve2(X, Y, X.length(), Y.length(), 0));
		
		
	} 

	private static int solve2(String X, String Y, int m, int n, int third) {
		if(m == 0 || n == 0) {
			return 0;
		}
		
		if(X.charAt(m - 1) == Y.charAt(n - 1)) {
			third = solve2(X, Y, m - 1, n - 1, third + 1);
		}else {
			third = Math.max(third, Math.max(solve2(X, Y, m - 1, n, 0), solve2(X, Y, m, n - 1, 0)));
		}
		
		return third;
	}

	private static int solve(String X, String Y, int m, int n, int res) {
		 
		if(m == 0 || n == 0) {
			return 0;
		}
		 
		if(X.charAt(m - 1) == Y.charAt(n - 1)) {
			res = solve(X, Y, m - 1, n - 1, res + 1);
		}else {
			res = Math.max(res, Math.max(solve(X, Y, m - 1, n, 0), solve(X, Y, m, n - 1, 0)));
		}
		return res;
	}
}