package hashing;

import java.util.HashMap;

public class ProcessingQueries1 {
	public static void main(String args[]) {
		int[] arr = {3,4,3,5,-2};
		int[] q = {5, 9};
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++) {
			hashMap.put(arr[i], 0);
		}
		
		for(int j = 0; j < q.length; j++) {
			if(hashMap.containsKey(q[j])) {
				System.out.println(q[j]+ " found");
			}
		}
	}
}
