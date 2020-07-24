import java.util.*;


public class StockSpan {

	
	public static void solve(int[] arr) {
		
		
		List<PairInt> list = new ArrayList<>();
		
		Stack<PairInt> stack = new Stack<>();
	
		for(int i = 0; i < arr.length; i++) {
			
			if(stack.isEmpty()) {
				list.add(new PairInt(-1,  arr[i]));
			}else if(!stack.isEmpty() && stack.peek().b > arr[i]) {
				list.add(new PairInt(stack.peek().a,   stack.peek().b));
			}else if(!stack.isEmpty() && stack.peek().b <= arr[i]) {
				
				
				while(!stack.isEmpty() && stack.peek().b <= arr[i]) {
					stack.pop();
				}
				
				if(stack.isEmpty()) {
					list.add(new PairInt(-1,  arr[i]));
				}else {
					list.add(new PairInt(stack.peek().a,   stack.peek().b));
				}
				
				
			}
			
			
			
			stack.push(new PairInt(i, arr[i]));
		}
		
//		
//		for(PairInt p : list) {
//			System.out.println(p.a +" "+ p.b);
//		}
		
		List<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			result.add(i - (list.get(i).a));
		}
		
		
		System.out.println(result);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		int[] arr = {100, 80, 60, 70, 60, 75, 85};
		solve(arr);
		
	}
}
