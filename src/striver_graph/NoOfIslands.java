package striver_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int first;
	int second;
	
	Pair(int first, int second){
		this.first = first;
		this.second = second;
	}
}

public class NoOfIslands {
	static void addEdge(int[][] adj, int u, int v) {
		adj[u][v] = 1;
	}
	static void printMatrix(int[][] adj, int row, int col) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void bfs(int r, int c, int[][] vis, int[][] adj) {
		Queue<Pair> q = new LinkedList<>();
		
		q.add(new Pair(r, c));
		int n = adj.length;
		int m = adj[0].length;
		vis[r][c] = 1;
		
		while(!q.isEmpty()) {
			int row = q.peek().first;
			int col = q.peek().second;
			q.remove();
			
			for(int r1 = -1; r1 <= 1; r1++) {
				for(int r2 = -1; r2 <= 1; r2++) {
					int nrow = row + r1;
					int ncol = col + r2;
					
					if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && adj[nrow][ncol] == 1 && vis[nrow][ncol] == 0) {
						vis[nrow][ncol] = 1;
						q.add(new Pair(nrow, ncol));
					}
				}
			}
			
		}
		
	}
	
	static int numIslands(int[][] adj, int row, int col) {
		int cnt = 0;
		int[][] vis = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(vis[i][j] == 0 && adj[i][j] == 1) {
					bfs(i, j, vis, adj);
					cnt++;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		int n = 5;
		int m = 4;
		
		int[][] adj = new int[n][m]; 
		
		addEdge(adj, 0,1);
		addEdge(adj, 0,2);
		addEdge(adj, 1,1);
		addEdge(adj, 1,2);
		addEdge(adj, 2,2);
		addEdge(adj, 4,0);
		addEdge(adj, 4,1);
		addEdge(adj, 4,3);
		
		printMatrix(adj, n, m);
		
		System.out.println(numIslands(adj, n, m));
		
	}
}
