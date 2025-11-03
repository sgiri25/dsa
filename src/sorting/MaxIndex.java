package sorting;

public class MaxIndex {
	public static void main(String args[]) {
		int[] arr = {5,2,6,4,4,3,1};
		int n = arr.length;
		
		int ans = 0;
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				if(arr[j] >= arr[i]) {
					System.out.println(i+"---"+j);
					ans = max(ans, j - i);
					
				}
					
			}
			System.out.println(ans);
		}
		
	}
	public static int max(int ans, int diff) {
		
		return diff > ans ? diff : ans;
	}
}
