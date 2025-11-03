package striver_graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryMaze {
	static class Pair {
		int row;
		int col;
		int dist;
		Pair(int dist, int row, int col){
			this.dist = dist;
			this.row = row;
			this.col = col;
		}
	}
	static int solutions(int rows, int cols, int[][] grid) {
		int[][] dist = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				dist[i][j] = (int)1e9;
			}
		}
		int[] source = {0, 1};
		int[] dest = {2,2};
		int[][] dirs = {{0,1}, {1, 0}, {0, -1}, {-1, 0}};
		
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(0, 0, 1));
		dist[0][1] = 0;
		
		while(!q.isEmpty()) {
			Pair curr = q.poll();
			int c_dist = curr.dist;
			int c_row = curr.row;
			int c_col = curr.col;
			
			for(int[] dir : dirs) {
				int nrow = c_row + dir[0];
				int ncol = c_col + dir[1];
				
				if(nrow >= 0 && ncol >= 0 && nrow < rows && ncol < cols ) {
					if(grid[nrow][ncol] == 1 && c_dist + 1 < dist[nrow][ncol]) {
						dist[nrow][ncol] = c_dist + 1;
						if(dest[0] == nrow && dest[1] == ncol) {
							return 1 + c_dist;
							
						}
						q.add(new Pair(1 + c_dist, nrow, ncol));
					}
				}
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int rows = 5;
		int cols = 4;
		int[][] grid = {
				{1,1,1,1},
				{1,1,0,1},
				{1,1,1,1},
				{1,1,0,0},
				{1,0,0,1}
		};
		System.out.println(solutions(rows, cols, grid));
		
	}
}
