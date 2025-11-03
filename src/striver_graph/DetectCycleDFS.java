package striver_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class PairD {
	int first;
	int second;
	
	PairD(int first, int second){
		this.first = first;
		this.second = second;
	}
}

public class DetectCycleDFS {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
	}
	
	static void isCycle(ArrayList<ArrayList<Integer>> adj) {
		boolean[] vis = new boolean[8];
		Queue<PairD> q = new LinkedList<>();
		
		q.add(new PairD(1,-1));
		
		
		
	}
	public static void main(String[] args) {
		int V = 8;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < V; i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 2, 1);
		addEdge(adj, 2, 5);
		addEdge(adj, 3, 1);
		addEdge(adj, 3, 4);
		addEdge(adj, 3, 6);
		addEdge(adj, 4, 3);
		addEdge(adj, 5, 2);
		addEdge(adj, 5, 7);
		addEdge(adj, 6, 3);
		//addEdge(adj, 6, 7);
		addEdge(adj, 7, 5);
		addEdge(adj, 7, 6);
		
		isCycle(adj);
	}
}
