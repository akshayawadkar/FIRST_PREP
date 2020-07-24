import java.util.*;



public class Kruskals {
	static class Edge{
		int src;
		int dest;
		int weight;
		
		public Edge(int src, int dest, int weight) {
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
	}

	static class Graph{
		int v;
		List<Edge> allEdges;
		
		public Graph(int v) {
			this.v = v;
			this.allEdges = new ArrayList<>();
		}
		
		public void addEdge(int src, int dest, int weight) {
			Edge newEdge = new Edge(src, dest, weight);
			allEdges.add(newEdge);
		}
		
		public List<Edge> kruskals() {
			
			PriorityQueue<Edge> pq = new PriorityQueue<>((a, b) -> {
				return a.weight - b.weight;
			});
			
			pq.addAll(allEdges);
		 	UnionFind set = new UnionFind(v);
		 	
		 	List<Edge> result = new ArrayList<>();
		 	
		 	int index = 0;
		 	while(index < v - 1) {
		 		
		 		Edge curr = pq.poll();
		 		int x = set.find(curr.src);
		 		int y = set.find(curr.dest);
		 		
		 		if(x == y) {
		 			
		 		}else {
		 			result.add(curr);
		 			index++;
		 			set.union(x, y);
		 		}
		 		
		 	}
			
			return result;
		}

		private void makeParent(int[] parent) {
			 
			
		}
	}
	
	
	
	public static void main(String[] args) {
		int vertices = 4;
		Graph graph = new Graph(vertices);
		graph.addEdge(1, 2, 5);
		graph.addEdge(1, 4, 4);
		graph.addEdge(2, 4, 2);
		graph.addEdge(2, 3, 3);
		graph.addEdge(4, 3, 6);
		List<Edge> kruskals = graph.kruskals();
		
		for(Edge edge : kruskals) {
			System.out.println(edge.src + "  " + edge.dest);
		}
		
	}
}
