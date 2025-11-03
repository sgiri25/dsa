package queue;

import java.util.Stack;

public class QueueByStack2 {
	int front;
	int bottomOfS1;
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	QueueByStack2(){
		
	}
	
	void push(int x) {
		if(s1.empty()) {
			bottomOfS1 = x;
		}
		s1.push(x);
		while(!s1.empty()) {
			s2.push(s1.peek());
			s1.pop();
		}
		
	}
	int pop() {
		int ans;
		if(s2.empty() && !s1.empty()) {
			while(!s1.empty()) {
				s2.push(s1.peek());
				s1.pop();
			}
		}
		if(s2.empty() && s1.empty()) {
			return -1;
		}
		front = s2.peek();
		ans = s2.peek();
		s2.pop();
		return ans;
	}
	int peek() {
		return front;
	}
	boolean empty() {
		return false;
	}
	
	
}

