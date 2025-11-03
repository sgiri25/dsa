package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSorted2 {
	static class Node implements Comparable<Node>{
		int i,j,val;
		Node(int i, int j, int val){
			this.i = i;
			this.j = j;
			this.val = val;
		}
		
		public int compareTo(Node other) {
			return Integer.compare(this.val, other.val);
		}
	}
	static ArrayList<Integer> mergeKArrays(int[][] arr, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		PriorityQueue<Node> minHeap = new PriorityQueue<>();
		
		// Push first element of each array
		for(int i = 0; i < k; i++) {
			if(arr[i].length > 0) {
				minHeap.add(new Node(i, 0, arr[i][0]));
				
			}
		}
		
		while(!minHeap.isEmpty()) {
			Node curr = minHeap.poll();
			result.add(curr.val);
			
			if(curr.j + 1 < arr[curr.i].length) {
				minHeap.add(new Node(curr.i, curr.j + 1, arr[curr.i][curr.j + 1]));
			}
		}
		
		return result;
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
