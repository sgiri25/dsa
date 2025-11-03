package pp;

public class SlidingWindow {
	public static void main(String args[]) {
		int[] arr = {1, 2, -1, 0, 4, 6};
		int k = 3;
		int n = arr.length;
		
		
		for(int i=0; i <= n-k; i++) {
			int sum = 0;
			
			for(int j = 0; j < k; j++) {					
				sum += arr[i+j];
				System.out.println(i+"---"+j);
			}
			
			
			System.out.println(sum);
		}
	}
}
