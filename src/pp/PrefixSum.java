package pp;

public class PrefixSum {
	public static void main(String args[]) {
		int[] arr = {3, 1, 5, 2, 4};
		for(int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
