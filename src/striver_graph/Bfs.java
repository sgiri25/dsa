package striver_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	static ArrayList<Integer> bfsGraph(ArrayList<ArrayList<Integer>> adj, int V) {
		ArrayList<Integer> bfs = new ArrayList<>();
		boolean[] vis = new boolean[V];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		vis[1] = true;
		
		while(!q.isEmpty()) {
			int node = q.poll();
			//System.out.println(node);
			bfs.add(node);
			
			for(int it : adj.get(node)) {
				if(vis[it] == false) {
					vis[it] = true;
					q.add(it);
				}
			}
		}
		return bfs;
	}
	public static void main(String[] args) {
		int n = 9;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);
		
		// Initialize of empty list for each vertex
		for(int i = 0; i < n; i++) {
			adj.add(new ArrayList<Integer>());
		}
		
//		addEdge(adj, 0, 1);
//		addEdge(adj, 0, 4);
//		addEdge(adj, 1, 2);
//		addEdge(adj, 1, 3);
//		addEdge(adj, 1, 4);
		
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 6);
		addEdge(adj, 2, 3);
		addEdge(adj, 2, 4);
		addEdge(adj, 6, 7);
		addEdge(adj, 6, 8);
		addEdge(adj, 4, 5);
		addEdge(adj, 7, 5);
		
		
		ArrayList<Integer> bfs = bfsGraph(adj, n);
		//System.out.print(bfs);
		for(int i : bfs) {
			System.out.print(i + " ");
		}
		
	}
}
