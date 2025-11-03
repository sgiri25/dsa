package hashing;

import java.util.HashMap;

public class BooleanMatrix2 {
	public static void main(String args[]) {
		int[][] mat = {
	               {0,1,1,0},
	               {0,0,0,0},
	               {0,0,0,1},
	               {0,1,0,0},
				};
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < 4; i++){
			//System.out.println(rowArr[i]);
			int majorDiagonal = Integer.MAX_VALUE;
			for(int j = 0; j < 4; j++) {
				if(mat[i][j] == 1) {
					hmap.put(j-i, 0);
					hmap.put(j+i, 0);
				}				
			}
			
		}
		
		for(int i = 0; i < 4; i++){
			//System.out.println(rowArr[i]);
			for(int j = 0; j < 4; j++) {
				
				while(hmap.get(j-i) != null) {
					mat[i][j] = 1;
					break;
				}
				
				while(hmap.get(j+i) != null) {
					mat[i][j] = 1;
					break;
				}
				
				
				
			}
		}
		
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.print("\n");
		}
		
	}
}
