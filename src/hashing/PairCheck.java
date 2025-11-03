package hashing;

import java.util.HashMap;

public class PairCheck {
	public static void main(String args[]) {
		int[] arr = {5,2,-3,7,11};
		int X = 2;
		//int[] arr = {4,3,2,7,1};
		//int X = 14;
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			hashMap.put(arr[i], 0);
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == X-arr[i]) {
				continue;
			}
			if(hashMap.containsKey(X - arr[i])) {
				System.out.println(arr[i]);
				System.out.println(X-arr[i]);
				
			}
		}
	}
}
