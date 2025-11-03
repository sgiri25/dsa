package pp;

public class LcmCountOfNElements {
	public static void main(String args[]) {
		int n = 20;
		int a = 2, b = 3;
		int count = 0;
		
		
		//for(int i = 0; i< n; i++) {
			count = n / a + n / b - (n / lcm(a,b));
			System.out.println(count);
			
			//lcm(a,b,c) = n/a+n/b+n/c - n/lcm(a,b) - n/lcm(b,c) - n / lcm(a,c) + n / lcm(a,b,c)
		//}
		
	}
	 public static int lcm(int a, int b) {
		 int temp=0;
		 for(int i = Max(a, b); i <= a * b; i++) {
			if(i % a == 0 && i % b == 0) {
				temp = i;
				break;
			}
		}
		 return temp;
	 }
	 
	 public static int Max(int a, int b) {
			return a > b ? a : b;
	}
	public static int Min(int a, int b) {
		return a < b ? a : b;
	}
}

//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

