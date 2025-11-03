package heap;

import java.util.PriorityQueue;

public class TyingRopes {
	static int minimalCost(int[] arr) {
		int n = arr.length;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			pq.add(arr[i]);
		}
		int cost = 0;
		while(pq.size() > 1) {
			int x = pq.poll();
			int y = pq.poll();
			int sum = x + y;
			pq.add(sum);
			cost += sum;
		}
		return cost;
	}
	public static void main(String[] args) {
		TyingRopes tr = new TyingRopes();
		int[] arr = {5,2,7};
		System.out.print(minimalCost(arr));
	}
}
