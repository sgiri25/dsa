package pp;

public class PrimalityTestInARange {
	public static void main(String args[]) {
		int n = 20;
		boolean[] is_prime = new boolean[n+1];
		for(int i = 0; i <= n; i++) {
			is_prime[i] = true;
		}
		is_prime[0] = false;
		is_prime[1] = false;
		
		for(int i = 2; i <= n; i++) {
			if(is_prime[i] && i * i <= n) {
				for(int j = i * i; j <= n; j += i) {
					is_prime[j] = false;
				}
			}		
			
		}
		
		for(int i = 0; i <= n; i++) {
			System.out.println(i+"-->"+is_prime[i]);
		}
	}
}
