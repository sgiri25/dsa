package pp;

public class RLookupOptimized2 {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6};
		int ans = 0, n=arr.length;
		
		for (int i = 0 ; i < n-1; i++) {
			ans += (i+1)*(n-1)*arr[i];
		}
		
		System.out.println(ans);
		
	}
}
