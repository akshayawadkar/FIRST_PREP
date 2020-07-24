import java.util.*;

public class NextSmallerElementToRight {

	
	 public static void solve(int[] arr) {
		 
		 Stack<Integer> stack = new Stack<>();
		 List<Integer> result = new ArrayList<>();
		 
		 for(int i = arr.length - 1; i >= 0; i--) {
			 
			 if(stack.isEmpty()) {
				 result.add(-1);
			 }else if(!stack.isEmpty() && stack.peek() < arr[i]) {
				 result.add(stack.peek());
			 }else if(!stack.isEmpty() && stack.peek() >= arr[i]) {
				 
				 while(!stack.isEmpty() && stack.peek() >= arr[i]) {
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
		 
		 Collections.reverse(result);
		 System.out.println(result);
		 
	 }
			 
	
	
	
	public static void main(String[] args) {
		
		
		int[] arr = {1, 3, 2, 4};
		
		solve(arr);
	}
}
