import java.util.*;

public class Test4 {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 2, 4};
		solve(arr);
	}

	private static void solve(int[] arr) {
		 
		List<Integer> result = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i = 0; i < arr.length; i++) {
			
			if(stack.isEmpty()) {
				result.add(-1);
			}else if(!stack.isEmpty() && stack.peek() < arr[i]) {
				result.add(stack.peek());
			}else if(!stack.isEmpty() && arr[i] <= stack.peek()) {
				while(!stack.isEmpty() && arr[i] <= stack.peek()) {
					stack.pop();
				}
				
				if(stack.isEmpty()) {
					result.add(-1);
				}else {
					result.add(stack.peek());
				}
			}
			
			stack.push(arr[i]);
		}
		
		System.out.println(result);
		
	}

}
