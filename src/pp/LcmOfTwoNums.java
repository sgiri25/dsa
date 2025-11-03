package pp;

public class LcmOfTwoNums {
	public static void main(String args[]) {
		int a = 12, b = 18;
		
		for(int i = Max(a, b); i < a * b; i++) {
			if(i % a == 0 && i % b == 0) {
				System.out.print(i);
				break;
			}
		}
		
	}
	
	public static int Max(int a, int b) {
		return a > b ? a : b;
	}
}
