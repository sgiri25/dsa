package pp;

public class LcmOfTwoNumsOptimized {
	public static void main(String args[]) {
		int[] arr = {12,18,20};
		int lcm = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			lcm = lcm * arr[i] / GCD(lcm, arr[i]);
		}
		System.out.print(lcm);
	}
	
	public static int GCD(int a, int b) {
		int divisor = Min(a,b);
		int dividend = Max(a,b);
		if(divisor == 0) {
			System.out.print(dividend);
		}
		while(dividend % divisor != 0) {
			int temp = divisor;
			divisor = dividend % divisor;
			dividend = temp;
		}
		return divisor;
	}
	
	public static int Max(int a, int b) {
		return a > b ? a : b;
	}
	public static int Min(int a, int b) {
		return a < b ? a : b;
	}
}
