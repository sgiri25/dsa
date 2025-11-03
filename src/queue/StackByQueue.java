package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackByQueue {
	Queue<Integer> q1 = new LinkedList<>(),
            q2 = new LinkedList<>();
	int front = 0, back = 0;
	StackByQueue(){
		
	}
	void push(int x) {
		q1.add(x);
		
	}
	int pop() {
		System.out.println(q1);
		while(q1.size() > 1) {
			q2.add(q1.peek());						
			q1.remove();
			
		}
		return q1.element();
	}
	int top() {
		return 0;
	}
	boolean empty() {
		return false;
	}
}
