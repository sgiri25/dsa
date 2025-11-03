package pp;

public class Bucketing {
	public static void main(String args[]) {
		int[] arr = {20, 25, 27, 33, 65, 70};
		int n = arr.length;
		
		//int min = Integer.MIN_VALUE;
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < n; i++) {
			//System.out.println(min);
			min = Min(min, arr[i]);
		}
		int temp_min = min;
		
		for (int i = 0; i < n; i++) {
			max = Max(max, arr[i]);
		}
		
		
		
		int gap = (max - min) / (n-1);
		
		
		
		int[][] bucket = new int[gap][gap];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j< gap; j++) {
				bucket[i][j] = min + j;
			}
			min = min + gap;
		}
		for (int i = 0; i < n; i++) { 
			for(int j = 0; j< gap; j++) {
				System.out.print(bucket[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		int[][] min_max = new int[n][2];	
		
		for (int i = 0; i < n; i++) {
			int bucket_name = (arr[i] - temp_min) / gap;
			int row_val = bucket[bucket_name][0];
			int[] bucket_arr = bucket[bucket_name];
			int bucket_length = bucket_arr.length;
			
			for(int j = 0; j < bucket_length; j++) {
				if(arr[i] == bucket_arr[j]) {
					int max2 = Max(row_val, bucket_arr[j]);
					int min2 = Min(row_val, bucket_arr[j]);
					min_max[bucket_name][0] = min2;
					min_max[bucket_name][1] = max2;
				}
			}
			
			
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(min_max[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		int prev_row_min = 0;
		int prev_row_max = 0;
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			//for(int j = 0; j < n; j++) {
			if(min_max[i][0] > 0) {
				if(prev_row_max > 0) {
					int diff = min_max[i][0] - prev_row_max ;
					System.out.println(diff);
					ans = Max(ans,diff);
				}
				prev_row_min = min_max[i][0];
				prev_row_max = min_max[i][1];
			}
			
			
			//}
		}
		
		System.out.print("Final-->"+ans);
		
		
		
		
		
	}
	public static int Max(int a, int b) {
		return a > b ? a : b;
	}
	public static int Min(int a, int b) {
		return a < b ? a : b;
	}
}
