
public class Test {

	
	public static void main(String[] args) {
		System.out.println(solve(3, 10000));
	}

	private static int solve(int i, int j) {
	 
		if(j == 0) {
			return 1;
		}
		
		return i * solve(i, j - 1);
	}

	 
}
 