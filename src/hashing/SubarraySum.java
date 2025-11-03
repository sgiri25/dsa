package hashing;

import java.util.HashMap;

public class SubarraySum {
	public static void main(String args[]) {
		//int[] arr = {6,-1,2,1,-1};
		int[] arr = {1,2,3,-6};
		
		int[] pSum = new int[arr.length];
		pSum[0] = arr[0];
		
		for(int i = 1; i < pSum.length; i++) {
			pSum[i] = pSum[i-1] + arr[i];
		}
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(0, 1);
		for(int i = 0; i < pSum.length; i++) {
//			if(hashMap.containsKey(pSum[i])){
//				System.out.println(i+"---"+pSum[i]);
//				int l = hashMap.get(pSum[i]);
//				System.out.println(l);
//				System.out.println("Subarray is"+ arr[++l] + "," +  arr[i]);
//			}
			hashMap.put(pSum[i], i);
		}
		
		
		System.out.println(hashMap);
		
	}
}
