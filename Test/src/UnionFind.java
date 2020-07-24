import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UnionFind {	
	
	private class Node{
		int val;
		int rank;
		Node parent;
		
		public Node(int val) {
			this.val = val;
			this.parent = this;
			this.rank = 0;
		}
	}
	
	private Map<Integer, Node> map;
	private int count;
	
	public UnionFind() {
		map = new HashMap<>();
	}
	
	public UnionFind(int n) {
	
		map = new HashMap<>();
		for(int i = 1; i <= n; i++) {
			this.makeSet(i);
		}
	}
	
	public void makeSet(int i) {
		Node node = new Node(i);
		map.put(i, node);
	}
	
	
	public boolean union(int x, int y) {
		
		Node node1 = map.get(x);
		Node node2 = map.get(y);
		
		Node parent1 = this.find(node1);
		Node parent2 = this.find(node2);
		
		if(parent1 == parent2) {
			return false;
		}
		
		if(parent1.rank >= parent2.rank) {
			parent1.rank = parent1.rank == parent2.rank ? parent1.rank + 1 : parent1.rank;
			parent2.parent = parent1;
		}else {
			parent1.parent = parent2;
		}
		
		return true;
	}
	
	public Node find(Node node) {
		Node parent = node.parent;
		if(parent == node) {
			return parent;
		}
		node.parent = find(node.parent);
		return node.parent;
	}
	
	public int find(int num) {
		return this.find(map.get(num)).val;
	}

	
	public boolean connected(int num1, int num2) {
		Node node1 = map.get(num1);
		Node node2 = map.get(num2);
		
		Node parent1 = this.find(node1);
		Node parent2 = this.find(node2);
		
		if(parent1 == parent2) {
			return false;
		}
		return true;
	}
	
	public int count() {
		Set<Integer> set = new HashSet<>();
		for(Integer num : map.keySet()) {
			set.add(find(num));
		}
		return set.size();
	}
	
	
	 
}


