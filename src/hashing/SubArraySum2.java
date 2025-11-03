package hashing;

import java.util.HashMap;

public class SubArraySum2 {
	public static void main(String args[]) {
		//int[] arr = {15,2,4,8,9,5,10,23};
		int[] arr = {2, 12, -2, -20, 10};
		//int target = 23;
		int target = -10;
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int sum = arr[0];
		hashMap.put(sum, 0);
		for(int i = 1; i < arr.length; i++) {
			sum += arr[i];
			if(hashMap.containsKey(sum-target)) {
				int sIdx = hashMap.get(sum-target) + 1;
				int cIdx = i;
				System.out.println(sIdx + "---"+ cIdx);
			}
			hashMap.put(sum, i);
		}
	}
}
