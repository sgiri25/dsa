package sorting;

public class Bubble {
	public static void main(String args[]) {
		int[] arr = {5,6,1,3,5};
		int n = arr.length;
		

		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			
		}
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
