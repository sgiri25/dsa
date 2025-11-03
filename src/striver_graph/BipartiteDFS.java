package striver_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteDFS {
	static ArrayList<ArrayList<Integer>> constructadj(int V, int[][] edges){
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i = 0; i< V; i++) {
			adj.add(new ArrayList<>());
		}
		
		for(int[] edge : edges) {
			adj.get(edge[0]).add(edge[1]);
			adj.get(edge[1]).add(edge[0]);
		}
		return adj;
	}
	
	static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] color, int x, int y) {
		for(int it : adj.get(node)) {
			if(color[it] == -1) {
				color[it] = 1 - color[node];
				dfs(it, adj, color, x, y);
			}else if(color[it] == color[node]) {
				return false;
			}
		}
		return true;
	}
	
	static boolean checkBipartite(int V, int[][] edges) {
		int[] color = new int[V];
		Arrays.fill(color, -1);
		
		ArrayList<ArrayList<Integer>> adj = constructadj(V, edges);
		
		int row = edges.length;
		int col = edges[0].length;
		int[] vis = new int[V];
	
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		vis[0] = 1;
		color[0] = 0;
		
		if(dfs(0, adj, color, row, col)) return true;
		return false;
		
//		while(!q.isEmpty()) {
//			int node = q.peek();
//			q.remove();
//			for(int it : adj.get(node)) {
//				//System.out.println(it);
//				
//				if(color[it] == -1) {
//					color[it] = 1 - color[node];
//					q.add(it);
//					vis[it] = 1;
//				}else if(color[it] == color[node]) {
//					return false;
//				}
//			}
//		}
//		
//		return true;
		
	}
	public static void main(String[] args) {
		int V = 4;
		int edges[][] = {{0, 1}, {1, 2}, {2, 3}};
		//int edges[][] = {{0, 1}, {0, 2}, {1,2}, {2, 3}};
		System.out.print(checkBipartite(V, edges));
	}
}
