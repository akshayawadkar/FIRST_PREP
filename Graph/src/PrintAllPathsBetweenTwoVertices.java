import java.util.*;

public class PrintAllPathsBetweenTwoVertices {

	public static class Graph{
		int v;
		LinkedList<Integer> adjMatrix[];
		
		public Graph(int v) {
			this.v = v;
			this.adjMatrix = new LinkedList[v];
			
			for(int i = 0; i < v; i++) {
				adjMatrix[i] = new LinkedList<Integer>();
			}
			
		}
		
		
		public void addEdge(int src, int dest) {
			adjMatrix[src].add(dest);
		}


		public List<List<Integer>> printAllPathsBetween(int src, int dest) {
			 
			List<Integer> subList = new ArrayList<>();
			List<List<Integer>> result = new ArrayList<>();
			
			boolean[] visited = new boolean[v];
			
			subList.add(src);
			
			helper(src, dest, visited, subList, result);
			
			
			return result;
		}


		private void helper(int src, int dest, boolean[] visited, List<Integer> subList, List<List<Integer>> result) {
			 if(src == dest) {
				 result.add(new ArrayList<>(subList));
				 return;
			 }
			 
			 visited[src] = true;
			 
			 for(int child : adjMatrix[src]) {
				 if(!visited[child]) {
					 subList.add(child);
					 helper(child, dest, visited, subList, result);
					 subList.remove(subList.size() - 1);
					 
				 }
			 }
			
			 visited[src] = false;
				
		}

 
	}
	
	public static void main(String[] args) {
		
		Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 3);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(4, 5);
		
		System.out.println(graph.printAllPathsBetween(0, 5));
	}
}


// visited[src] = true;
//			 subList.add(src);
//			 
//			 if(src == dest) {
//				 result.add(new ArrayList<>(subList));
//			 }else {
//				 for(int child : adjMatrix[src]) {
//					 if(!visited[child]) {
//						 helper(child, dest, subList, result, visited);
//					 }
//				 }
//			 }
//			 
//			 subList.remove(subList.size() - 1);
//			 visited[src] = false;*/




/////////////////////////////////////////////

//public List<List<Integer>> printAllPathsBetween(int src, int dest) {
//	
//	
//	List<List<Integer>> result = new ArrayList<>();
//	List<Integer> subList = new ArrayList<>();
//	
//	boolean[] visited = new boolean[v];
//	subList.add(src);
//	 
//	helper(src, dest, subList, result, visited);
//	
//	return result;
//}
//
//
//private void helper(int src, int dest, List<Integer> subList, List<List<Integer>> result, boolean[] visited) {
//	 
//	if(src == dest) {
//		
//		result.add(new ArrayList<>(subList));
//		return;
//	}
//	
//	visited[src] = true;
//	
//	for(int child : adjMatrix[src]) {
//		if(!visited[child]) {
//			subList.add(child);
//			helper(child, dest, subList, result, visited);
//			subList.remove(subList.size() - 1);
//		}
//		
//	}
//	
//	visited[src] = false;
//	
//}
//}
