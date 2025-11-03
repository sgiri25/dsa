package heap;

public class MaxHeap4 {
	static void swap(int x, int y) {
		int temp = y;
		y = x;
		x = temp;
	}
	static void maxHeapify(int ind, int[] arr) {
		int n = arr.length;
		if(ind > n  / 2) return;
		int maxi = ind;
		if(2 *ind < n ) {			
			if(arr[2*ind] > arr[maxi]) {
				maxi = 2 * ind;
			}
		}
		if(2 *ind + 1 < n ) {
			if(arr[2*ind + 1] > arr[maxi]) {
				maxi = 2 * ind + 1;
			}
		}
		
		if(maxi != ind) {
			swap(arr[maxi], arr[ind]);
			maxHeapify(maxi, arr);
			System.out.println(arr[0]);
		}
		
	}
	public static void main(String[] args) {
		
		int[] arr = {2,4,3,6,7,9};
		int n = arr.length;
		for(int i = n / 2; i > 1; i-- ){
		   maxHeapify(i,arr);
		}
		
		
	}
}
