package striver_graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumOfEnclaves {
	static void countEnclaves(int[][] mat) {
		int row = mat.length;
		int col = mat[0].length;
		
		Queue<int[]> q = new LinkedList<>();
		boolean[][] vis = new boolean[row][col];
		for(int i = 0; i < col; i++) {
			if(mat[0][i] == 1) {
				//result = floodFill(mat, 0, i);
				q.add(new int[] {0,i}) ;
				vis[0][i] = true;
			}
		}
		
		for(int i = 0; i < row; i++) {
			if(mat[i][0] == 1) {
				//result = floodFill(mat, i, 0);
				q.add(new int[] {i, 0}) ;
				vis[i][0] = true;
			}
		}
		
		for(int i = 0; i < col; i++) {
			if(mat[row-1][i] == 1) {
				//result = floodFill(mat, row-1, i);
				q.add(new int[] {row-1,i}) ;
				vis[row-1][i] = true;
			}
		}
		
		for(int i = 0; i < row; i++) {
			if(mat[row-1][i] == 1) {
				//result = floodFill(mat, i, col-1);
				q.add(new int[] {i,col-1}) ;
				vis[i][col-1] = true;
			}
		}
		
		int[][] dirs = {{1,0}, {0,1}, {-1, 0}, {0,-1}};
		
		while(!q.isEmpty()) {
			int cell_row = q.peek()[0];
			int cell_col = q.peek()[1];
			mat[cell_row][cell_col] = -1;
			q.remove();
			
			for(int[] dir : dirs) {
				int x = cell_row + dir[0];
				int y = cell_col + dir[1];
				
				if(x >= 0 && y >= 0 && x < row && y < col && !vis[x][y] && mat[x][y] == 1) {
					vis[x][y] = true;
					q.add(new int[] {x,y});
					mat[x][y] = -1;
				}
			}
		}
		
		for(int i = 0; i< mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] mat = {
				{ 0, 0, 0, 1, 1},
				{ 0, 0, 1, 1, 0},
				{ 0, 1, 0, 0, 0},
				{ 0, 1, 1, 0, 0},
				{ 0, 0, 0, 1, 1}
		};
		
		countEnclaves(mat);
	}
}
