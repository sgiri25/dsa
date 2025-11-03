package striver_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class dfs {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res ) {
		vis[node] = true;
		res.add(node);
		
		for(int it : adj.get(node)) {
			if(vis[it] == false) {
				//res.add(it);
				dfs(it, vis, adj, res);
			}
		}
	}
	
	static ArrayList<Integer> dfsGraph(ArrayList<ArrayList<Integer>> adj, int V){
		ArrayList<Integer> res = new ArrayList<>();
		boolean vis[] = new boolean[V];
		vis[0] = true;
		
		dfs(1, vis, adj, res);
		
		return res;
		
	}
	public static void main(String[] args) {
		int n = 9;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);
		for(int i = 0; i < n; i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(adj, 1,2);
		addEdge(adj, 1,3);
		addEdge(adj, 2,5);
		addEdge(adj, 2,6);
		addEdge(adj, 3,7);
		addEdge(adj, 3,4);
		addEdge(adj, 4,8);
		addEdge(adj, 7,8);
		
		ArrayList<Integer> dfs = dfsGraph(adj, n);
		for(int i : dfs) {
			System.out.print(i + " ");
		}
		
	}
}
