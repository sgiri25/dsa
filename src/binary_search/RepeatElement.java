package binary_search;

public class RepeatElement {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,6,7,8};
		int n = arr.length;
		int key = 5;
		
		int l = 0;
		int h = n - 1;
		
		while(l <= h) {
			int m = (l+h)/2;
			if(arr[m] == m) {
				h = m - 1;
			}else {
				if(arr[m+1] == arr[m]) {
					System.out.println(m);
					return;
				}else {
					l = m + 1;
				}
			}
		}
	}
}
