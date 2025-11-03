package striver_graph;

import java.util.ArrayList;
import java.util.HashSet;

public class CountNoOfIslands {
	static void dfs(int x, int y, int[][] vis, int[][] mat, ArrayList<Integer> vec, int row0, int col0) {
		vis[x][y] = 1;		
		vec.add(x - row0, y - col0);
		int row = mat.length;
		int col = mat[0].length;
		
		int[] delRow = {-1, 0, 1, 0};
		int[] delCol = {0, -1, 0, +1};
		
		for(int i = 0; i< 4; i++) {
			int nRow = x + delRow[i];
			int nCol = y + delCol[i];
			
			if(nRow >= 0 && nRow < row && nCol >= 0 && nCol < col && vis[nRow][nCol] == 0 && mat[nRow][nCol] == 1 ) {
				dfs(nRow, nCol, vis, mat, vec, row0, col0);
			}
		}
		
	}
	static int countIslands(int[][] mat) {
		int row = mat.length;
		int col = mat[0].length;
		int[][] vis = new int[row][col];
		HashSet<ArrayList<Integer>> st = new HashSet<>();
		
		for(int i = 0; i< row; i++) {
			for(int j = 0; j < col; j++) {
				if(vis[i][j] == 0 && mat[i][j] == 1) {
					ArrayList<Integer> vec = new ArrayList<>();
					dfs(i, j, vis, mat, vec, i, j);
					st.add(vec);
				}
			}
		}
		
		return st.size();
		
		
	}
	public static void main(String[] args) {
		int[][] mat = {
				{1,1,0,1,1},
				{1,0,0,0,0},
				{0,0,0,1,1},
				{1,1,0,1,0}
		};
		System.out.print(countIslands(mat));
	}
}
