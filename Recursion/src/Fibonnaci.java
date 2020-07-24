
public class Fibonnaci {

	
	public static void main(String[] args) {
		
		int limit = 6;
		System.out.println(fib(limit));
	}

	private static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		
		return fib(n - 1) + fib(n - 2);
	}

	 
}
 