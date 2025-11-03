package sorting;

public class Insertion {
	public static void main(String args[]) {
		//int[] arr = {23, 1, 10, 5, 2};
		int[] arr = {70, 15, 2, 51, 60};
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && temp <= arr[j]) {				
				int key = arr[j];				
				//arr[i] = key;
				arr[j+1] = arr[j];
			    j--;
			}
			arr[j+1] = temp;
			//System.out.println(arr[i]);
			
		}
		
//		for(int i = 0; i < n; i++) {
//			for(int j = i; j < n; j++) {
//				while(arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;				
//				}
//			}
//			
//		}
		
		for(int i = 0; i < n; i++) { 
			System.out.println(arr[i]);
		}
		
	}
}
