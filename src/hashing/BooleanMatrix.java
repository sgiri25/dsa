package hashing;

public class BooleanMatrix {
	public static void main(String args[]) {
		int[][] mat = {
		               {0,1,0,0},
		               {0,0,0,0},
		               {0,0,0,1},
		               {0,0,0,0},
					};
		
		int[] rowArr = {-1,-1,-1,-1};
		int[] colArr = {-1,-1,-1,-1};
		
		for(int i = 0; i< 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(mat[i][j] == 1) {
					rowArr[i] = i;
					colArr[j] = j;
					break;
				}
			}
		}
		
		for(int i = 0; i < 4; i++){
			//System.out.println(rowArr[i]);
			if(rowArr[i] != -1) {
				int j = 0;
				while(j < 4) {
					//System.out.println("1-->"+i+"---"+j);
					mat[rowArr[i]][j++] = 1;
				}
				
			}
			
		}
		
		System.out.println("-----------------------");
		
		for(int i = 0; i < 4; i++) {
			if(colArr[i] != -1) {
				int j = 0;
				while(j < 4) {
					//System.out.println("2-->"+i+"---"+j);
					mat[j++][colArr[i]] = 1;
				}
			}
		}
		
		for(int i = 0; i< 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.print("\n");
		}
			
		            		   
	}
}
