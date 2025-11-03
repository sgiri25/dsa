package pp;

public class SuffixMaxArr {
	public static void main(String args[]) {
		int[] arr = {3, 1, 5, 2, 4};
		int n = arr.length;
		
		int[] SMAX = new int[n];
		SMAX[n-1] = arr[n-1];
		
		for(int i = n - 2; i >= 0; i --) {
			SMAX[i] = max(SMAX[i+1], arr[i]);
		}
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
