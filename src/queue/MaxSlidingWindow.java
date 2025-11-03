package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow {
	public static void main(String args[]) {
		int[] arr = {5, -3, 7, 2, 4, 1, 0};
		int n = arr.length;
		int k = 4;
		
		Deque<Integer> d = new ArrayDeque<>();
		
		
		
		for(int i = 0; i < n; i++) {
			//int end_window_index = i+k-1;
			//int start_window_index = i;
			if(!d.isEmpty()) {
				System.out.println("Before While---------------------");
				System.out.println("Last ele-->"+arr[d.getLast()]);
				System.out.println("Curr-->"+arr[i]);
				
				
			}
			
			while(!d.isEmpty() && arr[i] >= arr[d.getLast()]) {
				d.removeLast();
			}
			d.add(i);
			System.out.println("After while---------------------");
			System.out.println(d);
			
			
			
		}
		
		for(int i = 0; i <= n-k;i++) {
			
		}
		
		
	}
}
