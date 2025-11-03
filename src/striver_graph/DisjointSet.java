package striver_graph;

public class DisjointSet {
	int[] parent;
	int[] rank;
	DisjointSet(int n){
		parent = new int[n];
		rank = new int[n];
		
		for(int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}
		
	}
	// find with Path compression
	int find(int x) {
		if(parent[x] != x) {
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}
	
	void union(int x, int y) {
		int rootX = find(x);
		int rootY = find(y);
		
		if(rootX == rootY) return;
		
		if(rank[rootX] < rank[rootY]) {
			parent[rootX] = rootY;
		}else if(rank[rootX] > rank[rootY]) {
			parent[rootY] = rootX;
		}else {
			parent[rootY] = rootX;
			rank[rootX]++; //increase rank when both are same
		}
	}
	public static void main(String[] args) {
		DisjointSet dsu = new DisjointSet(8);
		
		dsu.union(1, 2);
        dsu.union(2, 3);
        dsu.union(4, 5);
        dsu.union(6, 7);
        dsu.union(5, 6);
        
        System.out.println(dsu.find(3) == dsu.find(7)); // false
        dsu.union(3, 7);
        System.out.println(dsu.find(3) == dsu.find(7)); // true
	}
}
