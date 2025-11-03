package pp;

public class MaximizeExpOptimize {
	public static void main(String args[]) {
		int ans = Integer.MIN_VALUE;
		int[] arr = {1,2,3,4,-5};
		//int[] arr = {1, 5, 90, 15, 7, 77, 0};
		int n = arr.length;
		int p = 1;
		int q = 2;
		int r = 3;
		
		int[] pmax = new int[n];
		int[] smax = new int[n];
		
		pmax[0] = p * arr[0];
		for(int i = 1; i < n; i++) {
			pmax[i] = max(pmax[i-1], arr[i]);
		}
		
		for(int i = 0; i < pmax.length; i++) {
			//System.out.println(pmax[i]);
		}
		
		smax[n-1] = r * arr[n-1];
		for(int i = n - 2; i >= 0; i--) {
			smax[i] = max(smax[i+1], arr[i]);
		}
		
		//System.out.println("---------------------"+smax.length);
		
		for(int i = smax.length - 1; i >= 0; i--) {
			//System.out.println(smax[i]);
		}
		
		for(int i = 1; i < n - 2; i++) {
			System.out.println(pmax[i-1]);
			System.out.println(smax[i+1]);
			System.out.println(arr[i]);
			ans = max(ans, pmax[i-1] + q * arr[i] + smax[i+1]);
			System.out.println(ans);
		}
		
		System.out.print(ans);
		
		
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
}
