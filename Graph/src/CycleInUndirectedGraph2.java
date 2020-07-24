import java.util.LinkedList;
import java.util.*;

public class CycleInUndirectedGraph2 {
	
	static class Edge{
		int src, dest;
		public Edge(int src, int dest) {
			this.src = src;
			this.dest = dest;
		}
	}

	
	static class Graph{
		int v;
		LinkedList<Integer> adjMatrix[];
		 
		
		public Graph(int v) {
			this.v = v;
			adjMatrix = new LinkedList[v];
			
			for(int i = 0; i < v; i++) {
				adjMatrix[i] = new LinkedList<>();
			}
			
			 
		}
		
		
		
		public void addEdge(int src, int dest) {
			adjMatrix[src].add(dest);
			Edge edge = new Edge(src, dest);
			 
		}



		public boolean isCyclic() {
			  
			 boolean[] visited = new boolean[v];
			 
			 for(int i = 0; i < v; i++) {
				 if(helper(i, visited, -1)) {
					 return true;
				 }
			 }
			 
			 
			 return false;
		}



		private boolean helper(int curr, boolean[] visited, int parent) {
			
			visited[curr] = true;
			
			
			for(int child : adjMatrix[curr]) {
				if(!visited[child]) {
					if(helper(child, visited, parent)) {
						return true;
					}
				}else if(child != parent) {
					return true;
				}
			}
			 
			
			return false;
		}



	 
	}
	
	
	public static void main(String[] args) {
		int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
//        graph.addEdge(2, 1);
        
        
        
        System.out.println(graph.isCyclic());
        
        
	}
	
	
}
