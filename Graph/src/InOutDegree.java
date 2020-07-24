import java.util.*;

public class InOutDegree {

	private static void findInOutDegrees(int[][] edges) {
		 
		List<Integer> result = new ArrayList<>();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int[] edge : edges) {
			if(map.containsKey(edge[1])) {
				map.put(edge[1], map.get(edge[1]++));
			}else {
				map.put(edge[1], 1);
			}
			
			if(!map.containsKey(edge[0])) {
				map.put(edge[0], 0);
			}
		}
		
		for(Map.Entry entry : map.entrySet()) {
			if((int)entry.getValue() == 0) {
				result.add((int)entry.getKey());
			}
		}
		
		System.out.println(result);
		
	}
	 
	public static void main(String[] args) {
		
		int[][] edges = {{1, 2},
				{1, 3},
				{2, 4},
				{2, 5},
				{6, 4}};
		
		findInOutDegrees(edges);
		
	}

	
}
