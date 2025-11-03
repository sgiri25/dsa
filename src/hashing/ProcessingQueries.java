package hashing;

public class ProcessingQueries {
	public static void main(String args[]) {
		int[] arr = {3,4,3,5,-2};
		int[] q = {5, 9};
		int key1 = 5;
		int key2 = 9;
		// TC - O(n^2)
		for(int i = 0; i < q.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == q[i]) {
					System.out.println(q[i]+ " found");
				}
			}
		
			//System.out.println(q[i]+ " Not found");
			
		}
		
		
				
	}
}
