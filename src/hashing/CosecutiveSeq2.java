package hashing;

import java.util.Arrays;
import java.util.HashMap;

public class CosecutiveSeq2 {
	public static void main(String args[]) {
		//int[] arr = {10,3,7,9,5,4,16,20,6,5,19,5};
		//int[] arr = {2, 6, 1, 9, 4, 5, 3};
		//int[] arr = {1, 9, 3, 10, 4, 20, 2};
		int[] arr = {3,5,7,9};
		int n = arr.length;
		
		Arrays.sort(arr);

		
		int[] t = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                t[j++] = arr[i];
            }
        }

        // Adding last element to the array
      	t[j++] = arr[n-1];
          
        // Changing the original array
        for (int i = 0; i < j; i++) {
        	//System.out.println(t[i]);
            //arr[i] = t[i];
        }
		
		//System.out.println("j-->"+j);
		
//		for(int jj = 0; jj < arr.length; jj++) {
//			System.out.println(arr[jj]);
//		}
		
		
		
		
		int ans = 0;
		int cnt = 1;
		int min = t[0];
		int max = t[j - 1];
		
		HashMap<Integer, Boolean> hm = new HashMap<>();
		//System.out.println("T len-->"+t.length);
		for(int i = 0; i< j; i++) {
			//System.out.println(i+"----"+hm.get(t[i]));
			if(hm.get(t[i]) == null) {
				hm.put(t[i], true);
			}
		} 
		
		System.out.print(hm);
		
		for(int i = min; i < max; i++) {
			System.out.println(hm.get(i+1));
			if(hm.get(i+1) != null) {
				cnt++;
				ans = Math.max(ans, cnt);
			}else {
				cnt = 0;
			}
			System.out.println("CNT-->"+cnt);
		}
		System.out.println("ANS-->"+ans);
		
		
	}
}
