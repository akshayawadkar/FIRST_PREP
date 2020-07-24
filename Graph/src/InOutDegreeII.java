import java.util.*;

public class InOutDegreeII {

	private static void findInOutDegree(List<List<Integer>> graph, int n) {
		   int[] in = new int[n];
		   int[] out = new int[n];
		   
		   for(int i = 0; i < n; i++) {
			   List<Integer> curr = graph.get(i);
			   
			   out[i] = curr.size();
			   
			   for(int j = 0; j < curr.size(); j++) {
				   in[curr.get(j)]++;
			   }
		   }
		   
		   for(int i = 0; i < n; i++) {
			   System.out.println(i+" "+in[i]+" "+out[i]);
		   }
	}
	
	
	public static void main(String[] args) {
		
		List<List<Integer>> graph = new ArrayList<>();
		graph.add(new ArrayList<Integer>());
		graph.add(new ArrayList<>(Arrays.asList(2,3)));
		graph.add(new ArrayList<>(Arrays.asList(4,5)));
		graph.add(new ArrayList<Integer>());
		graph.add(new ArrayList<Integer>());
		graph.add(new ArrayList<Integer>());
		graph.add(new ArrayList<>(Arrays.asList(4)));
		
		int n = graph.size();
		findInOutDegree(graph, n);
		
	}
 
}
