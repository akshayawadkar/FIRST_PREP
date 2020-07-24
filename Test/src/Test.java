import java.util.Stack;

public class Test {
	
	public static void main(String[] args) {
		
		
		 
		System.out.println(removeKdigits("54321", 2));
	}
	
	
	public static String removeKdigits(String nums, int k) {
     
		Stack<Character> stack = new Stack<>();
		
		for(Character num : nums.toCharArray()) {
			while(k > 0 && !stack.isEmpty() &&  (stack.peek() - '0') > (num - '0')) {
				stack.pop();
				k--;
			}
			stack.push(num);
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
			 
		}
		System.out.println(sb.reverse());
		return "";
    }
}
  
/***
 * "54321"
 * ['5' ,'4', '3', '2', '1]
 *  k = 2
 *  5 k = 2 []
 *  
 *  
 ***/

/***
 * t && t -> t
 * t && f -> f
 * f && t -> f
 * f && f
 ***/


/***
 *  5 [] k = 2
 *  4 [5] k = 1
 *  3 [4] k = 1
 *     [3]   k = 0
 * 
 ***/
//
//1
//2
//3
//
//1 2 3//
//3 2 1 