import java.util.LinkedList;

public class CycleInDirectedGraph {

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
		
		public boolean isCyclic() {
			
			boolean[] visited = new boolean[v];
			boolean[] reStack = new boolean[v];
			
			for(int i = 0; i < v; i++) {
					if(helper(i, visited, reStack)) {
						return true;
				}
			}
			
			
			return false;
		}


		private boolean helper(int curr, boolean[] visited, boolean[] reStack) {
			
			if(reStack[curr]) {
				return true;
			}
			
			if(visited[curr]) {
				return false;
			}
			
			reStack[curr] = true;
			visited[curr] = true;
			
			
			for(int child : adjMatrix[curr]) {
				 
					if(helper(child, visited, reStack)) {
						return true;
					}
				 
			}
			
			
			reStack[curr] = false;
			
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		 	Graph graph = new Graph(4); 
	        graph.addEdge(0, 1); 
	        graph.addEdge(0, 2); 
	        graph.addEdge(1, 2); 
	        graph.addEdge(2, 0); 
	        graph.addEdge(2, 3); 
	        graph.addEdge(3, 3); 
	        
	        System.out.println(graph.isCyclic());
		
	}
}
