package pp;

public class SuffixMax {
	public static void main(String args[]) {
		int[] arr = {3, 1, 5, 2, 4};
		int n = arr.length;
		for(int i = n - 2; i >= 0; i--) {
			arr[i] = arr[i + 1] + arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
