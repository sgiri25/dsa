package pp;

public class ArrayReArrangement2 {
	public static void main(String args[]) {
		int[] arr = {2,0,1,4,5,3};
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			int old_val = arr[i] % n;
			arr[old_val] = n * i + arr[old_val];
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i = 0; i < n; i++) {
			arr[i] = arr[i] / n;
		}
		
		
		
		
	}
}
