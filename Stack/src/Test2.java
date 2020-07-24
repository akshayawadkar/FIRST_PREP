import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test2 {
	
	public static void solve(int[] arr) {
		
		List<Integer> result = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(stack.isEmpty()) {
				result.add(-1);
		 	}else if(!stack.isEmpty() && stack.peek() > arr[i]) {
				result.add(stack.peek());
			}else if(!stack.isEmpty() && stack.peek() <= arr[i]) {
				
				while(!stack.isEmpty() && stack.peek() <= arr[i]) {
					stack.pop();
				}
				
				if(stack.isEmpty()) {
					result.add(-1);
				}else {
					result.add(stack.peek());
				}
				
			}
			
			stack.add(arr[i]);
		}
		
		System.out.println(result);
	}

	
	public static void main(String[] args) {

		int[] arr = {1, 3, 2, 4};
		solve(arr);
		
	}
}
