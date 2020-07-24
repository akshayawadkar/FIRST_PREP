import java.util.LinkedList;
import java.util.*;

public class CycleInUndirectedGraph {
	
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
		List<Edge> allEdges;
		
		public Graph(int v) {
			this.v = v;
			adjMatrix = new LinkedList[v];
			
			for(int i = 0; i < v; i++) {
				adjMatrix[i] = new LinkedList<>();
			}
			
			allEdges = new ArrayList<>();
		}
		
		
		
		public void addEdge(int src, int dest) {
			adjMatrix[src].add(dest);
			Edge edge = new Edge(src, dest);
			allEdges.add(edge);
		}



		public boolean isCyclic() {
			 
			DisjointSet set = new DisjointSet();
			
			for(int i = 0; i < v; i++) {
				set.makeSet(i);
			}
			
			for(Edge edge : allEdges) {
				int x = set.findSet(edge.src);
				int y = set.findSet(edge.dest);
				
				if(x == y) {
					return true;
				}else {
					set.union(x, y);
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
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 3);
        graph.addEdge(4, 5);
        
        System.out.println(graph.isCyclic());
        
        
	}
	
	
}
