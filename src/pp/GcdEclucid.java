package pp;

public class GcdEclucid {
	public static void main(String args[]) {
		int a = 12, b = 18;
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
		System.out.print(divisor);
		
	}
	
	public static int Max(int a, int b) {
		return a > b ? a : b;
	}
	public static int Min(int a, int b) {
		return a < b ? a : b;
	}
}
