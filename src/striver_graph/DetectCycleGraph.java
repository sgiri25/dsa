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

public class DetectCycleGraph {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
	}
	static void printList(ArrayList<ArrayList<Integer>> adj){
		for(int i = 0; i < adj.size();i++) {
			System.out.print(i + " -> "+ adj.get(i));
			System.out.println();
		}
	}
	static boolean detectCycle(ArrayList<ArrayList<Integer>> adj) {
		int V = 8;
		ArrayList<Integer> bfs = new ArrayList<>();
		int[] vis = new int[V];
		Queue<PairD> q = new LinkedList<>();
		boolean flag = false;
		q.add(new PairD(1,-1));
		vis[1] = 1;
		
		while (!q.isEmpty()) {
			//System.out.println(q.poll().first);
			int node = q.peek().first;
			int parent = q.peek().second;
			
			//bfs.add(node);
			for(int it : adj.get(node)) {
				if(vis[it] == 0) {
					vis[it] = 1;
					q.add(new PairD(it, node));
				}else if(parent != it) {
					return true;
				}
			}
		}
		return false;
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
		
		printList(adj);
		
//		ArrayList<Integer> response = detectCycle(adj);
//		for(int res : response) {
//			System.out.print(res + " ");
//		}
		boolean flag = detectCycle(adj);
		System.out.print(flag);
		
	}
}
