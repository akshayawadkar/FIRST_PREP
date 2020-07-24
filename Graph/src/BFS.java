import java.util.LinkedList;

public class BFS {

	static class Graph{
		
		private LinkedList<Integer> adjMatrix[];
		private int v;
		
		
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
		
		public void BFS(int start) {
			
			LinkedList<Integer> q = new LinkedList<Integer>();
			boolean[] visited = new boolean[v];
			q.add(start);
			visited[start] = true;
			
			while(!q.isEmpty()) {
				int size = q.size();
				for(int i = 0; i < size; i++) {
					Integer curr = q.poll();
					visited[curr] = true;
					System.out.print(curr+" ");
					
					for(Integer child : adjMatrix[curr]) {
						if(!visited[child]) {
							q.add(child);
						}
					}
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
	        
	        g.BFS(2);
	        
	        
	}
	
	 
}
