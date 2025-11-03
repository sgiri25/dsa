package pp;

public class ProcessingQueries {
	public static void main(String args[]) {
		int[][] arr = {{1,2,3},{4,5,6}, {2,0,1}};
		int n = arr.length;
		int[][] p_row_max = new int[3][3];
	
		
		int row_sum = 0;
		for(int i = 0; i < 3; i++) {
			//p_row_max[i][0] = arr[i][0];
			for(int j = 1; j < 3; j++) {
				//p_row_max[i][j] = p_row_max[i][j-1] + arr[i][j];
				arr[i][j] = arr[i][j-1] + arr[i][j];
			}
			
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("\n");
			
		}
		
		for(int j = 0; j < 3; j++) {
			//p_row_max[i][0] = arr[i][0];
			for(int i = 1; i < 3; i++) {
				System.out.println(j+ " ===== "+i);
				//p_row_max[i][j] = p_row_max[i][j-1] + arr[i][j];
				arr[i][j] = arr[i-1][j] + arr[i][j];
			}
			
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
			
		}
		
		int ans = 0;
		int i1 = 1,j1 = 1;
		int i2 = 2,j2 = 2;
		
		ans = arr[i2][j2];
		
		if(i1 > 0) {
			ans += ans - arr[i1-1][j1]; 
		}
		
		if(j2 > 0) {
			ans += ans - arr[i2][j2-1];
		}
		if(i1 > 0 && j1 > 0) {
			ans += arr[i1-1][j1-1];
		}	
		
		System.out.println(ans);
		
	}
}