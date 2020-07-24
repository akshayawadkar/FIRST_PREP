
public class KMP {

	
	public static void main(String[] args) {
		String str = "abxabcabcaby";
		String pat = "abcabf";
		
		System.out.println(solve(str, pat));
	}

	private static boolean solve(String str, String pat) {
		 
		int[] lps = computePatternArray(pat.toCharArray());
		 
		int i = 0, j = 0;
		
		while(i < str.length() && j < pat.length()) {
			
			if(str.charAt(i) == pat.charAt(j)) {
				i++;
				j++;
			}else {
				if(j != 0) {
					j = lps[j - 1];
				}else {
					i++;
				}
			}
			
		}
		
		
		if(j == pat.length()) {
			return true;
		}
		
		
		return false;
	}

	private static int[] computePatternArray(char[] pattern) {
		 int[] lps = new int[pattern.length];
		 int i = 0;
		 
		 int j = 1;
		 
		 while(j < pattern.length) {
			 if(pattern[j] ==  pattern[i]) {
				 lps[j] = i + 1;
				 i++;
				 j++;
			 }else {
				 if(i != 0) {
					 i = lps[i - 1];
				 }else {
					 lps[j] = 0;
					 j++;
				 }
			 }
		 }
		 
		  
		 return lps;
	}
}
