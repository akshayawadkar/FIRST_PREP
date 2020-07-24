
public class LeftmostColumnWithAtleastOne {

	
	public static void main(String[] args) {
		
//		int[][] arr = {{0, 0, 0, 1},
//					   {0, 0, 0, 1},
//					   {0, 0, 0, 0},
//					   {0, 1, 1, 1}};
		
		int[][] arr = {{1, 1}, {0, 0}};
		
		System.out.println(solve(arr));
		
	}

	private static int solve(int[][] arr) {
		
		int top = 0, right = arr[0].length - 1;
		int min = Integer.MAX_VALUE;
		while(top < arr.length && right >= 0) {
			
//			System.out.println(top +" "+ right); 
			
			if(arr[top][right] == 1) {
				min = Math.min(min, right);
				right--;
			}else {
				top++;
			}
		}
//		System.out.println(top +" "+ right); 
	
		
		return min == Integer.MAX_VALUE ? -1 : min;
	}
}
