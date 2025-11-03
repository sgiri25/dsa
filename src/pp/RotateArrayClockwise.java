package pp;

public class RotateArrayClockwise {
	public static void main(String args[]) {
		int[] arr = {5,0,1,4,2};
		int n = arr.length;
		int k = 2;
		
		// Complexity -> O(n*k)
		
		for(int j = k-1; j >= 0; j--) {
			int temp = arr[n-1]; 
			for(int i = n-2; i >= 0; i--) {
				arr[i+1] = arr[i];
			}
			arr[0] = temp;
			
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
