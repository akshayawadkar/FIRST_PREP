
public class UglyNumbers {
 
	public static void main(String[] args) {
		
		System.out.println(isUgly(8));
	}

	private static boolean isUgly(int i) {
		
		if(i == 1) {
			return true;
		}
		
		if( i % 2 == 0) {
			return isUgly(i / 2);
		}else if( i % 3 == 0) {
			return isUgly(i / 3);
		}else if( i % 5 == 0) {
			return isUgly(i / 5);
		}
		
		return false;
	}
}
