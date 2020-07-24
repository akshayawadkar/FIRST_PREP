import java.util.LinkedList;

public class RoutesBetweenTwoNodes {

	static class Graph{
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
		
		
		public boolean hasPath(int src, int dest) {
			
			
			LinkedList<Integer> q = new LinkedList<>();
			boolean[] visited = new boolean[v];
			
			q.add(src);
			visited[src] = true;
			
			while(!q.isEmpty()) {
				
				int size = q.size();
				for(int i = 0; i < size; i++) {
					int curr = q.poll();
					
					if(curr == dest) {
						return true;
					}
					
					for(int child : adjMatrix[curr]) {
						if(!visited[child]) {
							visited[child] = true;
							q.add(child);
						}
					}
				}
				
			}
			
			
			return false;
		}

		public boolean dfs(int src, int dest) {
			
			boolean[] visited = new boolean[v];
			
			
			
			return helper(src, dest, visited);
		}

		private boolean helper(int src, int dest, boolean[] visited) {
			
			if(src == dest) {
				return true;
			}
			
			for(int child : adjMatrix[src]) {
				if(!visited[child]) {
					visited[child] = true;
					return helper(child, dest, visited);
				}
			}
			
			
			return false;
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Graph graph = new Graph(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 1);
		
		System.out.println(graph.hasPath(2, 3));
		System.out.println(graph.dfs(2, 3));
		
		
	}
	
	
}
