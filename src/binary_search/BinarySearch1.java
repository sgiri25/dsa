package binary_search;

public class BinarySearch1 {
	public static void main(String args[]) {
		int[] arr = {3,9,17,22,35,0};
		int key = 21;
		int n = arr.length;
		
		int l = 0;
		int h = n - 1;
		
		while(l <= h) {
			int m = (l + h) / 2;
			if(arr[m] == key) {
				System.out.println("Index-->"+m);
				return;
			}else if(arr[m] > key) {
				h = m - 1;
			}else {
				l = m + 1;
				System.out.println(l+"--"+h+"---"+m);
				
			}
		}
		
		
		for(int i = n; (i > 0 && arr[i] > key); i--) {
			arr[i+1] = arr[i];
			//System.out.println(arr[i]);
		}
		arr[l] = key;
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
