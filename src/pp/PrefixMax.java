package pp;

public class PrefixMax {
	public static void main(String args[]) {
		int[] arr = {5, -1, 0, 4, 2, 7};
		int[] p_max = new int[6];
		p_max[0] = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			p_max[i] = max(p_max[i-1], arr[i]);
		}	
		
		for (int i = 0; i < p_max.length; i++) {
			System.out.println(p_max[i]);
		}
		
	
		for (int i = 1; i < arr.length; i++) {
			arr[i] = max(arr[i-1], arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
