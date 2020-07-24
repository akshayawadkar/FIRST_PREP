import java.util.LinkedList;

public class CountPathsBetweenTwoVertices {

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


		public int countPathsBetween(int src, int dest) {
			 
			
			int result = helper(src, dest, 0);
			return result;
		}

		private int helper(int src, int dest, int paths) {
			if(src == dest) {
				paths++;
			}
			
			for(int child : adjMatrix[src]) {
				paths = helper(child, dest, paths);
			}
			return paths;
		}
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Graph g = new Graph(5); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(0, 3); 
        g.addEdge(1, 3); 
        g.addEdge(2, 3); 
        g.addEdge(1, 4); 
        g.addEdge(2, 4);
        
        System.out.println(g.countPathsBetween(0, 3));
	}
}


