package pp;

public class PrimalityTest {
	public static void main(String args[]) {
		int N = 17;
		int count = 0;
		
		for(int i = 2; i < N; i++) {
			if(N % i == 0) {
				count = count + 1;
				
			}
		}
		
		if(count == 0) {
			System.out.print("Number is prime");
		}else {
			System.out.print("Number is not prime");
		}
	}
}
