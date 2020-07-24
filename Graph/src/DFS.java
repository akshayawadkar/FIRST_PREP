import java.util.LinkedList;

public class DFS {

	
	public static class Graph{
		
		LinkedList<Integer> adjMatrix[];
		int v;
		
		Graph(int v){
			this.v = v;
			adjMatrix = new LinkedList[v];
			
			for(int i = 0; i < v; i++) {
				adjMatrix[i] = new LinkedList<>();
			}
		}
		
		public void addEdge(int src, int dest) {
			adjMatrix[src].add(dest);
		}
		
		public void DFS(int start) {
			boolean[] visited = new boolean[v];
			
			helper(start, visited);
		}

		private void helper(int start, boolean[] visited) {
			 
			if(visited[start]) {
				return;
			}
			visited[start] = true;
			System.out.print(start+" ");
			
			for(Integer child : adjMatrix[start]) {
				if(!visited[child]) {
					helper(child, visited);
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Graph g = new Graph(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        
        g.DFS(2); 
		
	}
}
