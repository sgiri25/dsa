package hashing;

import java.util.HashMap;

public class SubArraySum3 {
	public static void main(String args[]) {
		//int[] arr = {2,1,4,-3,-2,3,-1,-2,6};
		//int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
		int[] arr = {1,2,3};
		int n = arr.length;
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		int pSum = arr[0];
		int ans = 0;
		hashMap.put(pSum, 0);
		int sIdx = 0;
		int cIdx = -1;
		for(int i = 1; i < n; i++) {
			pSum += arr[i];
			if(hashMap.containsKey(pSum)) {
				sIdx = hashMap.get(pSum) + 1;
				cIdx = i;
				ans = Max(ans, cIdx-sIdx);
				
			}else {
				hashMap.put(pSum, i);
			}
			
		}
		System.out.println(sIdx+"---"+cIdx+"---"+ans);
	}
	
	public static int Max(int x,int y) {
		return x > y ? x : y;
	}
}
