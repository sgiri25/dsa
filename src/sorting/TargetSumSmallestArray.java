package sorting;

public class TargetSumSmallestArray {
	public static void main(String args[]) {
		int[] arr = {2,3,1,2,4,3};
		int k = 7;
		int n = arr.length;
		int sum = arr[0];
		for(int i = 1; i < n; i++){
			sum = sum + arr[i];
			arr[i] = sum;
		}
		for(int i = 0; i < n; i++) {
			int j;
			int l = i;
			int h = n - 1;
			
			while(l <= h) {
				int m = (l+h)/2;
				if(arr[m] <= k) {
					j = m;
					h = n - 1;
				}else {
					h = m;
				}
				
			}
		}
	}
}
