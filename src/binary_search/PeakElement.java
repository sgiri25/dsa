package binary_search;

public class PeakElement {
	public static void main(String args[]) {
		int[] arr = {10,20,15,2,23,90,67};
		int n = arr.length;
		
		int l = 0;
		int h = n - 1;
		
		if(arr[l] >= arr[l+1]) {
			System.out.println("Peak-->"+arr[l]);
			return;
		}else if(arr[h] >= arr[h-1]) {
			System.out.println("Peak1-->"+arr[h]);
			return;
		}
		
		while(l <= h) {
			int m = (l+h)/2;
			if(arr[m] >= arr[m+1] && arr[m] >= arr[m-1]) {
				System.out.println("Peak2-->"+arr[m]);
				return;
			}else {
				if(arr[m+1] >= arr[m] && arr[m-1] >= arr[m]) {
					h = m - 1;
				}else if(arr[m+1] >= arr[m]) {
					l = m + 1;
				}else if(arr[m-1] >= arr[m]) {
					h = m - 1;
				}
			}
		}
	}
}
