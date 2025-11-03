package pp;

public class ReverseInLookUP1 {
	public static void main(String args[]) {
		int[] arr = {1,2,3};
		int n = arr.length;
		int ans = 0;
		
		
		// Worst case --> O(n^2) * O(N)
//		p_max[0] = arr[0];
//		for(int i = 1; i < n; i++) {
//			p_max[i] = p_max[i-1] + arr[i];
//		}
		
//		for(int i = 0; i < n; i++) {
//			System.out.println(p_max[i]);
//		}
		
		for(int i=0; i < n; i++) {
			int[] p_max = new int[n];
			p_max[i] = arr[i];
			System.out.println("i-->"+i+"-->"+p_max[i]);
			for(int j = i+1; j < n; j++) {
				//ans += getSum(arr, i, j);
				p_max[j] = p_max[j-1] + arr[j];
				System.out.println("j-->"+j+"---"+p_max[j]);
				
			}
		}
		
		for(int i=0; i < n; i++) {
			for(int j = i; j < n; j++) {
				//ans += getSum(arr, i, j);
				//System.out.println(p_max[j]);
				
			}
		}
		
		//System.out.println(ans);		
		
	}
	
	public static int getSum(int[] arr, int i, int j) {
		int sum = 0;
		
		for(int k = i; k <= j; k ++) {
			sum += arr[k];
		}
		System.out.println(i+"---"+j+"--Sum-->"+sum);
		return sum;
	}
}
