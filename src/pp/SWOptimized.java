package pp;

public class SWOptimized {
	public static void main(String args[]) {
		int[] arr = {1,2,-1,0,4};
		int n = arr.length;
		int k = 3;
		
		int sum = 0;
		
		for(int i = 0; i< k; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		for(int i = 0; i < k - 1; i++) {
			
			sum = sum - arr[i] + arr[n-k+i+1]; 
			
			System.out.println(sum);
		}
		
		
	}
}
