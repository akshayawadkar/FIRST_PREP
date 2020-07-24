import java.util.LinkedList;

public class FindIfThereIsAPathBetweenTwoVertices {

	
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
		
		public boolean isReachable(int src, int dest) {
			
			
			LinkedList<Integer> q = new LinkedList<Integer>();
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
	}
	
	
	public static void main(String[] args) {
		
		
		Graph g = new Graph(4); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
//        g.addEdge(1, 2); 
//        g.addEdge(2, 0); 
//        g.addEdge(2, 3); 
//        g.addEdge(3, 3); 
//        
        System.out.println(g.isReachable(1, 2));
		
		
	}
}


