package stack;

public class SumOfMin {
	public static void main(String args[]) {
		int[] arr = {2,1,5,9};
		int n = arr.length;
		int m = 10^9 + 7;
		int ans = 0;
		
		for(int i = 0 ; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for(int j = i; j < n; j++) {
				min = Math.min(min, arr[j]);
				System.out.println(min);
				ans += min;
				//ans  = (ans % m + min % m) % m;
			}
		}
		
		System.out.println(ans);
	}
}
