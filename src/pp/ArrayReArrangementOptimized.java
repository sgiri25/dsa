package pp;

public class ArrayReArrangementOptimized {
	public static void main(String args[]) {
		int[] arr = {2,0,1,4,5,3};
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] >= 0) {
				int ind = arr[i];
				int val = i;
				
				while(ind != i) {
					int temp = arr[ind];
					arr[ind] = -(val+1);
					val = ind;
					ind = temp;
				}
				arr[ind] = -(val+1);
				
			}
		}
		
		for(int i = 0; i < n; i++) {
			arr[i] = -1 * arr[i] - 1;
			
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
			
		}
	}
}
