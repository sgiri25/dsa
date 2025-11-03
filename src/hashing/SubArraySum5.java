package hashing;

import java.util.HashMap;

public class SubArraySum5 {
	public static void main(String args[]) {
		//int[] arr = {2,1,4,-1,0};
		int[] arr = {10, 2, -2, -20, 10};
		int n = arr.length;
		//int  k = 3;
		int k = -10;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		int pSum = 0;
		int count = 0;
		
		hm.put(0, 1);
		
		for(int i = 0; i < n; i++) {
			pSum += arr[i];
			if(hm.containsKey(pSum - k)) {
				System.out.println(pSum-k);
				System.out.println(hm.get(pSum - k));
				count += 1;
				//System.out.println(count);
				//System.out.println("IF--"+pSum);
				hm.put(pSum, 0);
			}else {
				//System.out.println("ELSE--"+pSum);
				hm.put(pSum, 0);
			}
			
			
		}
		System.out.println(hm);
		
	}
}
