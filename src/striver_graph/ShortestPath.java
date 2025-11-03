package striver_graph;

import java.util.ArrayList;
import java.util.Stack;

class PairS{
	int first;
	int second;
	int third;
	
	PairS(int second, int third){
		this.second = second;
		this.third = third;
	}
}


public class ShortestPath {
	static void topoSort(int node, ArrayList<ArrayList<PairS>> adj, int vis[], Stack<Integer> st) {
		vis[node] = 1;
		for(int i = 0; i < adj.get(node).size(); i++) {
			int v = adj.get(node).get(i).second;
			if(vis[v] == 0) {
				topoSort(v, adj, vis, st);
			}
		}
		st.add(node);
	}
	static void shortestPath(int src, int n, int m, int[][] edges){
		ArrayList<ArrayList<PairS>> adj = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			ArrayList<PairS> temp = new ArrayList<PairS>(); 
			adj.add(temp);
		}
		
		for(int i = 0; i < n; i++) {
			int u = edges[i][0];
			int v = edges[i][1];
			int wt = edges[i][2];
			
			adj.get(u).add(new PairS(v, wt));
		}
		
		int vis[] = new int[n];
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < n; i++) {
			if(vis[i] == 0) {
				topoSort(i, adj, vis, st);
			}
		}
		
		int[] dist = new int[n];
		for(int i = 0; i<n; i++) {
			dist[i] = (int)1e9;
		}
		dist[0] = 0;
		while(!st.isEmpty()) {
			int node = st.peek();
			st.pop();
			for(int i = 0; i < adj.get(node).size(); i++) {
				int v = adj.get(node).get(i).second;
				int wt = adj.get(node).get(i).third;
				if(dist[node] + wt < dist[v] ) {
					dist[v] = dist[node] + wt;
				}
			}
			
		}
		
		for(int i = 0; i < n; i++) {
			if(dist[i] == 1e9) dist[i] = -1;
			else System.out.println(dist[i]);
		}
		
		
	}
	public static void main(String args[]) {
		int n = 6;
		int m = 7;
		int[][] adj = {
			{ 0,1,2 },
			{ 0,4,1 },
			{ 4,5,4 },
			{ 4,2,2 },
			{ 1,2,3 },
			{ 2,3,6 },
			{ 5,3,1 }
			
		};
		
		int src = 0;
		
		shortestPath(src, n, m, adj );
	}
}
