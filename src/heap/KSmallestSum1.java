package heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KSmallestSum1 {
	static class Pair implements Comparable<Pair>{
		int i, j, val;
		Pair(int i, int j, int val) {
			this.i = i;
			this.j = j;
			this.val = val;
		}
		
		public int compareTo(Pair other) {
			return Integer.compare(this.val, other.val);
		}
	}
	static void smallestSum(int[] arr1, int[] arr2, int n) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		ArrayList<Integer> al = new ArrayList<>();
		pq.add(new Pair(0, 0, arr1[0]+arr2[0]));
		
		
		Map<Pair, Boolean> mp = new HashMap<>();
		mp.put(new Pair(0, 0, arr1[0]+arr2[0]), true);
		
		while(n-- > 0) {
			Pair p = pq.poll();
			al.add(arr1[p.i]+arr2[p.j]);
			System.out.println("i-->"+p.i);
			System.out.println("j-->"+p.j);
			
			System.out.println(mp.containsKey(new Pair(p.i + 1, p.j, arr1[p.i +1] + arr2[p.j])));
			if(p.i + 1 < arr1.length && mp.containsKey(new Pair(p.i + 1, p.j, arr1[p.i +1] + arr2[p.j])) == false) {
				mp.put(new Pair(p.i + 1, p.j, arr1[p.i +1] + arr2[p.j]), true);
				pq.add(new Pair(p.i + 1, p.j, arr1[p.i +1] + arr2[p.j]));
				//al.add(arr1[p.i]+arr2[p.j]);
			}
			
			if(p.j + 1 < arr2.length && mp.containsKey(new Pair(p.i, p.j+1, arr1[p.i] + arr2[p.j+1])) == false) {
				mp.put(new Pair(p.i, p.j+1, arr1[p.i] + arr2[p.j+1]), true);
				pq.add(new Pair(p.i, p.j+1, arr1[p.i] + arr2[p.j+1]));
				//al.add(arr1[p.i]+arr2[p.j]);
			}
			
		}
		
		for(int num : al) {
			System.out.print(num + " ");
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		int[] A = { 5, 7, 11, 12 };
		int[] B = { 4, 9, 10 };
		int k = 4;
		
		smallestSum(A, B, k);
		
		
	}
}
