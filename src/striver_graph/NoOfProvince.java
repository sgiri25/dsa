package striver_graph;

import java.util.ArrayList;

public class NoOfProvince {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		//adj.get(v).add(u);
	}
	static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for(int i = 0; i < adj.size(); i++) {
			System.out.print(i + " -> ");
			for(int node : adj.get(i)) {
				System.out.print(node + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 9;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);
		for(int i = 0; i < n; i++) {
			adj.add(new ArrayList<Integer>());
		}
		//addEdge(adj, 1,1);
		addEdge(adj, 1,2);
		addEdge(adj, 2,1);
		addEdge(adj, 2,3);
		//addEdge(adj, 2,2);
		addEdge(adj, 3,2);
		
		//addEdge(adj, 4,4);
		addEdge(adj, 4,5);
		addEdge(adj, 5,4);
		addEdge(adj, 5,6);
		//addEdge(adj, 5,5);
		addEdge(adj, 6,5);
		//addEdge(adj, 6,6);
		
		addEdge(adj, 7,8);
		addEdge(adj, 8,7);
		
		//System.out.println(adj);
		printGraph(adj);
	}
}
