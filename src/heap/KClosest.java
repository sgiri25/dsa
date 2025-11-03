package heap;

import java.util.PriorityQueue;

public class KClosest {
	static class Pair implements Comparable<Pair>{
		int first, second;
		Pair(int a, int b){
			first = a;
			second = b;
		}
		
		public int compareTo(Pair o) {
			System.out.println(first);
			System.out.println(o.first);
			System.out.println(o.second + " "+ second);
			int x1 = first * first;
			int y1 = second * second;
			int x2 = o.first * o.first;
			int y2 = o.second * o.second;
			
			return (x1+y1) - (x2+y2);
			
		}
	}
	static void kClosestPoints(int x[], int y[], int n, int k) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++) {
			pq.add(new Pair(x[i], y[i]));
		}
		
		for(int i = 0; i < k; i++) {
			Pair p = pq.poll();
			
			System.out.println(p.first + " "+ p.second);
		}
	}
	public static void main(String[] args) {
		// x coordinates of points
		int x[] = {1, -2};
		// y coordinates of points
		int y[] = {3,2};
		
		int K = 1;

	    int n = x.length;

	    kClosestPoints(x, y, n, K);
	}
}
