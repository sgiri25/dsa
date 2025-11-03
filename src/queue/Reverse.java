package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse {
	Queue<Integer> q1 = new LinkedList<>();
	Stack<Integer> s1 = new Stack<>();
	Reverse(){}
	void push(int x) {
		q1.add(x);
		System.out.println(q1);
	}
	void pop() {
		while(!q1.isEmpty()) {
			s1.push(q1.peek());
			q1.remove();
		}
	}
	
	void reverse() {
		while(!s1.empty()) {
			q1.add(s1.peek());
			s1.pop();
		}
		System.out.println(q1);
		
	}
}
