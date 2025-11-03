package striver_graph;

public class SurroundedRegions {
	static char[][] floodFill(char[][] mat, int x, int y) {
		int row = mat.length;
		int col = mat[0].length;
		int[][] dirs = {{1,0}, {0,1}, {-1, 0}, {0,-1}};
		mat[x][y] = 'O';
		for(int[]dir : dirs) {
			int nrow = x + dir[0];
			int ncol = y + dir[1];
			
			if(nrow >= 0 && ncol >= 0 && nrow < row && ncol < col) {
				if(mat[nrow][ncol] == '-') {
					mat[nrow][ncol] = 'O';
				}
			}
		}
		return mat;
	}
	static char[][] FindZeroEdge(char[][] mat) {
		int row = mat.length;
		int col = mat[0].length;
		
		int[][] ans = new int[row][col];
		int[][] dirs = {{1,0}, {0,1}, {-1, 0}, {0,-1}};
		int[][] vis = new int[row][col];
		char[][] result = new char[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(mat[i][j] == 'O') {
					mat[i][j] = '-';
					vis[i][j] = 1;
				}
			}
		}
		
		for(int i = 0; i < col; i++) {
			if(mat[0][i] == '-') {
				result = floodFill(mat, 0, i);
			}
		}
		
		for(int i = 0; i < row; i++) {
			if(mat[i][0] == '-') {
				result = floodFill(mat, i, 0);
			}
		}
		
		for(int i = 0; i < col; i++) {
			if(mat[row-1][i] == '-') {
				result = floodFill(mat, row-1, i);
			}
		}
		
		for(int i = 0; i < row; i++) {
			if(mat[row-1][i] == '-') {
				result = floodFill(mat, i, col-1);
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		char[][] mat =  {
				{'X', 'O', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X', 'O', 'X'},
                {'X', 'X', 'X', 'O', 'O', 'X'},
                {'O', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'O', 'X', 'O'},
                {'O', 'O', 'X', 'O', 'O', 'O'},
               };
		char[][] result = FindZeroEdge(mat);
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j< result.length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
