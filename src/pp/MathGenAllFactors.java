package pp;

public class MathGenAllFactors {
	public static void main(String args[]) {
		int N = 20;
		for(int i = 1; i <= Math.sqrt(N); i++) {
			if(N % i == 0) {
				if( i * i == N) {
					System.out.print(i);
				}else {
					System.out.println(i);
					System.out.println(N / i);
				}
			}
		}
		//System.out.println(2 * (Math.sqrt(N) + 1));
		
	}
}
