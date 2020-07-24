import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSorting {

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
		}



		public void topologicalSort() { 
			
			boolean[] visited = new boolean[v];
			Stack<Integer> stack = new Stack<>();
			
			
			for(int i = 0; i < v; i++) {
				
				if(!visited[i]) {
					helper(i, stack, visited);
				}
			}
			
			while(!stack.isEmpty()) {
				System.out.print(stack.pop()+ " ");
			}
			
		}



		private void helper(int curr, Stack<Integer> stack, boolean[] visited) {
			 
			
			visited[curr] = true;
			
			for(int child : adjMatrix[curr]) {
			
				if(!visited[child]) {
					helper(child, stack, visited);
				}
			}
			
			stack.add(curr);
			 
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Graph g = new Graph(6);  
        g.addEdge(5, 2);  
        g.addEdge(5, 0);  
        g.addEdge(4, 0);  
        g.addEdge(4, 1);  
        g.addEdge(2, 3);  
        g.addEdge(3, 1); 
        g.topologicalSort();
	}
}
