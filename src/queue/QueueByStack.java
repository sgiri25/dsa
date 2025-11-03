package queue;

import java.util.Stack;

public class QueueByStack {
	int[] arr = new int[10000];
	int front;
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	QueueByStack(){
		
		
	}
	
	void push(int x) {
		if(s1.empty()) {
			front = x;
		}
		s1.push(x);
	}
	
	int pop() {
		int ans;
		while(!s1.empty()) {
			s2.push(s1.peek());
			s1.pop();
		}
		ans = s2.peek();
		s2.pop();
		while(!s2.empty()) {
			if(s1.empty()) {
				front = s2.peek();
			}
			s1.push(s2.peek());
			s2.pop();
		}
		return ans;		
	}
	
	int peek() {
		return front;
	}
	
	boolean empty() {
		return s1.isEmpty();
	}
}
