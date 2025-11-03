package striver_graph;

import java.util.ArrayList;

public class DisconnectedAdjMatrix {
	public static void main(String[] args) {
		int vertices = 5;
		int[][] adj = new int[vertices][vertices];
		//addEdge(adj, 1,1);
//		addEdge(adj, 1,2);
//		addEdge(adj, 2,1);
//		addEdge(adj, 2,3);
//		//addEdge(adj, 2,2);
//		addEdge(adj, 3,2);
//		
//		//addEdge(adj, 4,4);
//		addEdge(adj, 4,5);
//		addEdge(adj, 5,4);
//		addEdge(adj, 5,6);
//		//addEdge(adj, 5,5);
//		addEdge(adj, 6,5);
//		//addEdge(adj, 6,6);
//		
//		addEdge(adj, 7,8);
//		addEdge(adj, 8,7);
		addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);

        // Add edges for component 2
        addEdge(adj, 3, 4);
		
		System.out.println(numProvinces(adj, vertices));
		
		// print adjacency matrix
        printMatrix(adj);
	}
	
	private static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int[] vis) {
		vis[node] = 1;
		
		for(int it : adjLs.get(node)) {
			if(vis[it] == 0) {
				dfs(it, adjLs, vis);
			}
			
		}
	}
	
	static int numProvinces(int[][] adj, int V) {
		ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < V; i++) {
			adjLs.add(new ArrayList<Integer>());
		}
		
		// to change matrix to list
		for(int i = 0; i < V; i++) {
			for(int j = 0; j < V; j++) {
				if(adj[i][j] == 1 && i != j ) {
					adjLs.get(i).add(j);
					adjLs.get(j).add(i);
				}
			}
		}
		
		int vis[] = new int[V];
		int cnt = 0;
		for(int i = 0; i < V; i++) {
			if(vis[i] == 0) {
				cnt++;
				dfs(i, adjLs, vis );
			}
		}
		return cnt;
	}
	
	static void addEdge(int[][] adj, int u, int v) {
		adj[u][v] = 1;
		adj[v][u] = 1;
	}
	
	static void printMatrix(int[][] adj) {
		for(int i = 0; i < adj.length; i++) {
			for(int j = 0; j < adj[i].length; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
	}
}
