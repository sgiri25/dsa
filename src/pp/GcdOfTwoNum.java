package pp;

public class GcdOfTwoNum {
	public static void main(String args[]) {
		int a = 12, b = 18;
		int min = Min(a, b);
	
		int gcd=1;
		for(int i = 2; i < min; i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
				
			}
			
		}
		
		System.out.println(gcd);
		
		
		
	}
	public static int Min(int a, int b) {
		return a < b ? a : b;
	}
}
