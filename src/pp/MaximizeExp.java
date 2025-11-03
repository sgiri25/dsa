package pp;

public class MaximizeExp {
	public static void main(String args[]) {
		int ans = Integer.MIN_VALUE;
		int[] arr = {1,2,3,4,-5};
		int p = 1;
		int q = 2;
		int r = 3;
		
		for(int i=0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					ans = max(ans, p * arr[i] + q * arr[j] + r * arr[k]);
				}
			}
		}
		System.out.println(ans);
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
