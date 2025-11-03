package striver_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopoTask {
	public static void main(String[] args) {
		//int N = 4;
		int N = 2;
		int[][] prerequisites = {{1,0},{0,1}};
		//int[][] prerequisites = { { 1, 0 }, { 2, 1 }, { 3, 2 } };
		// Declare the 2D ArrayList
//		List<List<Integer>> adj = new ArrayList<>();
//		adj.add(new ArrayList<>(Arrays.asList(1,0)));
//		adj.add(new ArrayList<>(Arrays.asList(2,1)));
//		adj.add(new ArrayList<>(Arrays.asList(3,2)));
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i = 0; i < N; i++) { 
			adj.add(new ArrayList<>());
		}
		
		
		int[] deg = new int[N];
		for(int[] edge : prerequisites) {	
			adj.get(edge[0]).add(edge[1]);
			deg[edge[1]]++;
			
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < N; i++) {
			if(deg[i] == 0) {
				q.offer(i);
			}
		}
		int cnt = 1;
		while(!q.isEmpty()) {
			int node = q.poll();
			for(int neighbor : adj.get(node)) {
				deg[neighbor]--;
				if(deg[neighbor] == 0) {
					cnt++;
					q.offer(neighbor);
				}
			}
		}
		
		if(cnt == N) {
			System.out.println("Yes");
		}else {
			System.out.println("No"+ cnt);
		}
	}
}
