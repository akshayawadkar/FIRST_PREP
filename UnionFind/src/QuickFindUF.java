import java.util.Arrays;

public class QuickFindUF {

	private int[] id;
	
	public QuickFindUF(int N) {
		id = new int[N];
		for(int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		
		for(int i = 0; i < id.length; i++) {
			if(id[i] == pid) {
				id[i] = qid;
			}
		}
	}
	
//	public static void main(String[] args) {
//		
//		QuickFindUF set = new QuickFindUF(10);
//		
//		set.union(1, 2);
//		set.union(5, 6);
//		set.union(3, 8);
//		set.union(4, 9);
//		set.union(3, 4);
//		 
//		System.out.println(Arrays.toString(set.id));
//		
//		
//		
//	}
}



//[0, 2, 2, 9, 9, 6, 6, 7, 9, 9]
 
