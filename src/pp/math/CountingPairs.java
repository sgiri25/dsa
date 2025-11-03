package pp.math;

public class CountingPairs {
	public static void main(String args[]) {
		int[] arr = {2,2,1,7,5,3};
		int count = 0;
		int n = arr.length;
		int k = 4;
		
		for(int i = 0; i < n; i++ ) {
			for(int j = i+1; j < n; j++) {
				if((arr[i] + arr[j]) % k == 0) {
					count += 1;
				}
				
			}
		}
		
		System.out.print(count);
	}
}
