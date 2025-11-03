package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
	static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
		int V = adj.size();
		
		int s = 0; // source node
		// create an array to store the traversal
		ArrayList<Integer> res = new ArrayList<>();
		
		// create an queue for BFS
		Queue<Integer> q = new LinkedList<>();
		
		// Initially mark all the vertices as not visited
		boolean[] visited = new boolean[V];
		
		// mark source node as visited and enqueue it
		visited[s] = true;
		q.add(s);
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			res.add(curr);
			
			for(int x : adj.get(curr)) {
				if(!visited[x]) {
					visited[x] = true;
					q.add(x);
				}
			}
		}
		
		
		return res;
		
	}
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		adj.add(new ArrayList<>(Arrays.asList(1,2)));
		adj.add(new ArrayList<>(Arrays.asList(0,2,3)));
		adj.add(new ArrayList<>(Arrays.asList(0,4)));
		adj.add(new ArrayList<>(Arrays.asList(1,4)));
		adj.add(new ArrayList<>(Arrays.asList(2,3)));
		
		System.out.println(adj);
		
		ArrayList<Integer> ans = bfs(adj);
		
		for( int i : ans) {
			System.out.println(i + " ");
		}
	}
}
