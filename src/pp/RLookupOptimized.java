package pp;

public class RLookupOptimized {
	public static void main(String args[]) {
		int[] arr = {1,2,3};
		int n = arr.length;
		int ans = 0;
		
		// T.C --> O(N^2)
		
		for (int i = 0; i< n; i++) {
			int sum = 0;
			for(int j = i; j < n; j++) {
				sum += arr[j];
				ans += sum;
			}
			
		}
		
		System.out.println(ans);
	}
}
