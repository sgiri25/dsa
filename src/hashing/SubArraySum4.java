package hashing;

import java.util.HashMap;

public class SubArraySum4 {
	public static void main(String args[]) {
		int[] arr = {10,5,2,7,1,-10};
		//int[] arr = {-5, 8, -14, 2, 4, 12};
		int k = 15;		
		//int k = -5;
		int n = arr.length;
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int pSum = arr[0];
		int ans = 0;
		//hashMap.put(0, -1);
		hashMap.put(pSum, 0);
		int sIdx = 0;
		int cIdx = -1;
		for(int i = 1; i < n; i++) {
			pSum += arr[i];
			if(hashMap.containsKey(pSum-k)) {
				sIdx = hashMap.get(pSum-k) + 1;
				cIdx = i;
				ans = Max(ans, cIdx-sIdx);
				
			}else if(pSum == k) {
				System.out.println(i+"---"+pSum);
				//System.out.println(pSum)
				//sIdx = hashMap.get(pSum);
				//cIdx = i;
				//ans = Max(ans, cIdx-sIdx);
			}
			if(!hashMap.containsKey(pSum)) {
				hashMap.put(pSum, i);
			}
			
		}
		System.out.println(hashMap);
		System.out.println(sIdx+"---"+cIdx+"---"+ans);
	}
	public static int Max(int x,int y) {
		return x > y ? x : y;
	}
}
