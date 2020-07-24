import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DisjointSet {

	
	public static class Node{
		int val;
		int rank;
		Node parent;
	}
 
	Map<Integer, Node> map;
	
	public DisjointSet() {
		map = new HashMap<>();
	}
	
	
	public void makeSet(int val) {
		
		Node node = new Node();
		node.val = val;
		node.rank = 0;
		node.parent = node;
		map.put(val, node);
	}
	
	
	public boolean union(int val1, int val2) {
		Node n1 = map.get(val1);
		Node n2 = map.get(val2);
		
		Node parent1 = this.findSet(n1);
		Node parent2 = this.findSet(n2);
		
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
	
	
	public Node findSet(Node node) {
	
			Node parent = node.parent;
	        if (parent == node) {
	            return parent;
	        }
	        node.parent = findSet(node.parent);
	        return node.parent;
	}
	
	public int findSet(int node) {
	
		return this.findSet(map.get(node)).val;
	}
	
	
	public int countSets() {
		Set<Integer> set = new HashSet<>();
		for(Integer i : map.keySet()) {
			set.add(this.findSet(i));
		}
		return set.size();
	}
	
	
	
	public static void main(String[] args) {
		DisjointSet ds = new DisjointSet();
        ds.makeSet(1);
        ds.makeSet(2);
        ds.makeSet(3);
        ds.makeSet(4);
        ds.makeSet(5);
        ds.makeSet(6);
        ds.makeSet(7);

        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);
        ds.union(6, 7);
        ds.union(5, 6);
        ds.union(3, 7);

        System.out.println(ds.findSet(1));
        System.out.println(ds.findSet(2));
        System.out.println(ds.findSet(3));
        System.out.println(ds.findSet(4));
        System.out.println(ds.findSet(5));
        System.out.println(ds.findSet(6));
        System.out.println(ds.findSet(7));
        
        System.out.println("\n");
        
        System.out.println(ds.countSets());
	}
}
