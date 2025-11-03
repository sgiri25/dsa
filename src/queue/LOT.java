package queue;

import java.util.LinkedList;
import java.util.Queue;

public class LOT {
	public static void main(String args[]) {
		int N = 10;
		Queue<Integer> q1 = new LinkedList<>();
		int c = 0;
		q1.add(0);
		while(c < N) {
			int x = q1.peek();
			if(x != 0) {
				System.out.println(x);
				c += 1;
			}
			q1.remove();
			q1.add(10 * x + 1);
			q1.add(10 * x + 2);
			q1.add(10 * x + 3);
			//System.out.println(q1);
		}
		System.out.println(q1);
		
	}
}
