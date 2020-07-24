import java.util.*;

// Two examples to consider
// {{"MUC","LHR"},{"JFK","MUC"},{"SFO","SJC"},{"LHR","SFO"}}
// {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}}

public class ReconstructIternary {

	public static void main(String[] args) {
		
		String[][] input = {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
		List<List<String>> tickets = new ArrayList<>();
		for(String[] i : input) {
			tickets.add(Arrays.asList(i));
		}
		System.out.println(solve(tickets));
		
	}

	private static List<String> solve(List<List<String>>  tickets) {
		
		Map<String, PriorityQueue<String>> map = new HashMap<>();
		buildGraph(tickets, map);
		System.out.println(map);
		List<String> result = new ArrayList<>();
		dfs("JFK", map, result);
		
		return result;
	}

	private static void dfs(String src, Map<String, PriorityQueue<String>> map, List<String> result) {
		
		 PriorityQueue<String> pq = map.get(src);
		 
		 while(pq != null && !pq.isEmpty()) {
			 dfs(pq.poll(), map, result);
		 }
		
		 result.add(0, src);
	}

	private static void buildGraph(List<List<String>> tickets, Map<String, PriorityQueue<String>> map) {
		 
		for(List<String> ticket : tickets) {
			String src = ticket.get(0);
			String dest = ticket.get(1);
			
			map.putIfAbsent(src, new PriorityQueue<>());
			map.get(src).add(dest);
			
		}
		
	}
	
}
