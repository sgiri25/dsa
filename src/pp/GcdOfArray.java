package pp;

//for time complexity we look for worst case scnarios
//
//here the time complexity is sum of finding gcd between all elements
//
//complexity for one element is log(a[i]), now this will be max for max(a[i])
//
//therefore we take the complexity log(max(a[i])) for all elements
//
//and hence N*log(max(a[i])) 

public class GcdOfArray {
	public static void main(String args[]) {
		int[] arr = {12,18,20};
		int n = arr.length;
		int gcd = GCD(arr[0], arr[1]);
		
		for(int i = 2; i < n; i++) {
			gcd = GCD(gcd, arr[i]);
		}
		System.out.print(gcd);
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
