package heap;

import java.util.ArrayList;
import java.util.Collections;

public class MergeKSorted1 {
	static ArrayList<Integer> mergeKArrays(int[][] arr, int k) {
		ArrayList<Integer> output = new ArrayList<>();
		for(int[] item : arr) {
			for(int it : item) {
				output.add(it);
			}
		}
		Collections.sort(output);
		return output;
	}
	public static void main(String[] args) {
		int[][] arr = {
	            {1, 3, 5, 7},
	            {2, 4, 6, 8},
	            {0, 9, 10, 11}
	        };
	        int k = 3;
	        
	        //mergeKArrays(arr, k);
	        
	       ArrayList<Integer> res = mergeKArrays(arr, k);
	       for(int item : res) {
	    	   System.out.print(item + " ");
	       }
	}
}
