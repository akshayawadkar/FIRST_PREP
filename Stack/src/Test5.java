import java.util.*;

public class Test5 {

	
	public static void main(String[] args) {
		
		int[] arr = {100, 80, 60, 70, 60, 75, 85};
		
		
		solve(arr);
	}

	private static void solve(int[] arr) {
		 
		
		List<Integer> result = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i = 0; i < arr.length; i++) {
			
			if(stack.isEmpty()) {
				result.add(-1);
				
			}else if(!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
				result.add(stack.peek());
				
			}else if(!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
				
				while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
					stack.pop();
				}
				
				if(stack.isEmpty()) {
					result.add(-1);
				}else {
					result.add(stack.peek());
				}
				
			}
			stack.add(i);
		}
		
		for(int i = 0; i < result.size(); i++) {
			System.out.println(i - (result.get(i)));
		}
		
	}
}
