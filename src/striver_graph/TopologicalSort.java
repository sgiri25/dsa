package striver_graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
	static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, Stack<Integer> st) {
		vis[node] = true;
		
		
		
		for(int it : adj.get(node)) {
			if(!vis[it]) {
				if(dfs(it, adj, vis, st) == true) {
					return true;
				}
			}
			
		}
		st.push(node);
		return false;
	}
	static int[] topologicalSort(int V, int[][] edges) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		
		for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
		
//		for(int i = 0; i < edges.length; i++) {
//			for(int j = 0; j < edges.length; j++) {
//				adj.get(i).add(j);
//			}
//		}
		
		boolean[] vis = new boolean[V];
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < V; i++) {
			if(!vis[i]) {
				dfs(i, adj, vis, st);
			}
		}
		
		int[] ans = new int[V];
		int i = 0;
		while(!st.isEmpty()) {
			ans[i++] = st.peek();
			st.pop();
		}
		return ans;
	}
	public static void main(String[] args) {
		int V = 6;
		int edges[][] = {{2, 3}, {3, 1}, {4, 0}, {4, 1}, {5, 0}, {5, 2}};
		
		int[] result = topologicalSort(V, edges);
		for(int i = 0; i< result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
