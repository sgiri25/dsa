package striver_graph;

import java.util.LinkedList;
import java.util.Queue;

class PairM {
	int first;
	int second;
	
	PairM(int first, int second){
		this.first = first;
		this.second = second;
	}
}
public class Matrix01 {
	
	static int[][] getResult(int[][] mat) {
		Queue<PairM> q = new LinkedList<>();
		int row = mat.length;
		int col = mat[0].length;
		boolean[][] vis = new boolean[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(mat[i][j] == 1) {
					q.add(new PairM(i, j));
					vis[i][j] = true;
				}
				
			}
		}
		
		int[][] ans = new int[row][col];
		int[][] dirs = {{1,0}, {0,1}, {-1, 0}, {0,-1}};
		int dis = 0;
		
		while(!q.isEmpty()) {
			int size = q.size();
			
			while(size-- > 0) {
				
				int cr = q.peek().first;
				int cc = q.peek().second;
				q.remove();
				ans[cr][cc] = dis;
				for(int[]dir : dirs) {
					int i = cr + dir[0];
					int j = cc + dir[1];
					System.out.println(i + "--->"+ j);
					
					if(i >= 0 && j >= 0 && i < row && j < col && !vis[i][j] ) {
						q.add(new PairM(i, j));
						vis[i][j] = true;
					}
				}
				System.out.println("DIS-->"+dis);
			}
			
			dis++;
			//checkNearestOne(mat, cr, cc);
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int[][] mat = {
				{1,0,1},
				{1,1,0},
				{1,0,0}
		};
		
		int[][] result = getResult(mat);
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j< result.length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
