package striver_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopoBFS {
	static int[] topologicalSort(int V, int[][] edges) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		
		for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
		
		boolean[] vis = new boolean[V];
		int[] degree = new int[V];
		
		for(int i = 0; i < V; i++) {
			for(int it : adj.get(i)) {
				degree[it]++;
			}
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < V; i++) {
			if(degree[i] == 0) {
				q.offer(i);
			}
		}
		
		int[] result = new int[V];
		int index = 0;
		
		while(!q.isEmpty()) {
			int node = q.poll();
			result[index++] = node;
			
			for(int neighbor: adj.get(node)) {
				degree[neighbor]--;
				if(degree[neighbor] == 0) {
					q.offer(neighbor);
				}
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		int V = 6;
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {4, 5}, {5, 1}, {5, 2}};
        
        int[] result = topologicalSort(V, edges);
        if (result.length > 0) {
            for (int i : result) {
                System.out.print(i + " ");
            }
        }
	}
}
