package binary_search;

public class SearchInSortedArray {
	public static void main(String args[]) {
		int[] arr = {5, 6, 7, 1,2,3,4};
		int n = arr.length;
		// {3,8,10,11,14,22} --> {10,11,14,22,3,8}
		int key = 4;
		
		int l = 0;
		int h = arr.length;
		int pivot=-1;
		
		while(l <= h) {
			int mid = (l+h)/2;
			if(arr[mid] > arr[mid+1]) {
				pivot = mid;
				int l1 = 0;
				int h1 = pivot;
				
				while(l1 <= h1) {
					int m1 = (l1+h1) / 2;
					if(arr[m1] == key) {
						System.out.println(m1);
						return;
					}else if(arr[m1] > key) {
						h1 = m1 - 1;
					}else {
						l1 = m1 + 1;
					}
				}
				
				int l2 = pivot + 1;
				int h2 = n - 1;
				while(l2 <= h2) {
					int m2 = (l2+h2) / 2;
					if(arr[m2] == key) {
						System.out.println(m2);
						return;
					}else if(arr[m2] > key) {
						h2 = m2 - 1;
					}else {
						l2 = m2 + 1;
					}
				}
				
				return;
				
			}else if(arr[mid] > arr[n-1]) {
				l = mid + 1;
			}else if(arr[mid] <= arr[n-1]) {
				h = mid - 1;
			}
		}
		
		
		
	}
}
