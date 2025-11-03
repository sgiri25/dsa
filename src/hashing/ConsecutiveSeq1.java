package hashing;

import java.util.HashMap;

public class ConsecutiveSeq1 {
	public static void main(String args[]) {
		Long min = Long.MAX_VALUE;
		//int[] arr = {13,16,12,15,14};
		int[] arr = {34, 23, 52, 12, 3};
		int n = arr.length;
		
		HashMap<Long, Long> hashMap = new HashMap<Long, Long>();
		
		for(int i = 0; i < n; i++) {
			long k = (long)arr[i];			
			hashMap.put(k, 0L);
			min = Math.min(min, (long)arr[i]);
		}
		
		for(long i = min; i < min+n; i++) {
			if(hashMap.containsKey(i)) {
				System.out.println("value is present in map "+i);
			}else {
				System.out.println("value is not present in map "+i);
			}
		}
	}
	
}
