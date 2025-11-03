package striver_graph;

import java.util.ArrayList;

public class DetectCycleDirectedGraph {
	static ArrayList<ArrayList<Integer>> constructadj(int V, int[][] edges){
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i = 0; i< V; i++) {
			adj.add(new ArrayList<>());
		}
		
		for(int[] edge : edges) {
			adj.get(edge[0]).add(edge[1]);
		}
		return adj;
	}
	static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] path_vis) {
		vis[node] = 1;
		path_vis[node] = 1;
		for(int it : adj.get(node)) {
			if(vis[it] == 0) {
				if(dfs(it, adj, vis, path_vis)) {
					return true;
				}
			}
			else if(path_vis[it] == 1) {
				return true;
			}
			
			
		}
		path_vis[node] = 0;
		return false;
	}
	private static boolean detectCycle(int V, int[][] edges) {
		ArrayList<ArrayList<Integer>> adj = constructadj(V, edges);
		int[] vis = new int[V];
		int[] path_vis = new int[V];
		
		for(int i = 0; i < V; i++) {
			if(vis[i] == 0 && dfs(i, adj,vis, path_vis)) {
				return true;
			}	
			
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		int V = 4;
		int edges[][] = {{0, 1}, {0, 2}, {1, 2}, {2, 0}, {2, 3}};
		//int edges[][] = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
		System.out.print(detectCycle(V, edges));
	}
}
