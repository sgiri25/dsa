package heap;

import java.util.ArrayList;
import java.util.Collections;

public class KSmallestSum {
	static void smallestSum(int[] arr1, int[] arr2, int n) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int it1 : arr1) {
			for(int it2 : arr2) {
				int sum = it1 + it2;
				al.add(sum);
			}
			//System.out.println();
		}
		
		Collections.sort(al);
		for(int i =0; i < n; i++) {
			System.out.print(al.get(i)+ " ");
		}
	}
	public static void main(String[] args) {
		int[] A = { 5, 7, 11, 12 };
		int[] B = { 4, 9, 10 };
		int k = 4;
		
		smallestSum(A, B, k);
		
		
	}
}
