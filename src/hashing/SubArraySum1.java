package hashing;

import java.util.HashMap;

public class SubArraySum1 {
	public static void main(String args[]) {
		//int[] arr = {4,2,-3,1,6};
		int[] arr = {0, 4, 2, 0, 1, 6};
		//int[] arr = {1,2,3,-6};
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		//hashMap.put(0, 1);
		hashMap.put(arr[0], 0);
		int sum = arr[0];
		for(int i = 1; i < arr.length; i++) {
			sum += arr[i];
			if(arr[i] == 0) {
				System.out.println(i);
			}
			else if(hashMap.containsKey(sum)) {
				int sIdx = hashMap.get(sum);
				int eIdx = i;
				System.out.println(++sIdx +"----"+eIdx);
			}else if(sum == 0) {
				int sIdx = 0;
				int eIdx = i;
				System.out.println( sIdx +"----"+eIdx);
			}
			hashMap.put(sum, i);
		}
	}
}
