package striver_graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
	static void rottenOranges(int[][] orange, int x, int y, int rot, int cnt) {
		int[][] dir = {
				{-1,0},
				{1,0},
				{0,-1},
				{0,1}
		};
		Queue<int[]> q = new LinkedList<>();
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				if(orange[i][j] == 2) {
					q.add(new int[] {i, j});
				}
			}
		}
		
		while(!q.isEmpty()) {
			cnt++;
			
		}
	}
	public static void main(String[] args) {
		// define an orange matrix
		int[][] orange = {
				{0,1,2},
				{0,1,2},
				{2,1,1}
		};
		int row = 3, col = 3, rot = 2, cnt = 0;
		
		rottenOranges(orange, row, col, rot, cnt);
		
		
	}
}
