package binary_search;

public class BinarySearch {
	public static void main(String args[]) {
		int[] arr = {10,23,35,40,56,70,93,100,121};
		int n = arr.length;
		int key = 42;
		
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
			}
		}
		System.out.println("Item not found");
		
	}
}
