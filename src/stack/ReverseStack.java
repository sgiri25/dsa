package stack;

import java.util.Stack;

public class ReverseStack {
	public static void main(String args[]) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		//System.out.println(s1.peek());
		Stack s2 = reverse(s1);
		System.out.println(s2.peek());
		s2.pop();
		System.out.println(s2.peek());
		s2.pop();
		System.out.println(s2.peek());
		s2.pop();
		System.out.println(s2.peek());
	}
	public static Stack<Integer> reverse(Stack<Integer> s1) {
		if(s1.empty()) {
			System.out.println("When empty");
			//s1.push(x);	
			return s1;
		}
		int x = (int) s1.peek();
		
		s1.pop();
		reverse(s1);
		System.out.println("After reverse empty");
		PB(s1, x);
		return s1;
	}
	
	public static Stack<Integer> PB(Stack<Integer> s1, int ele) {
		System.out.println("PB--"+ele);
		if(s1.empty()) {
			s1.push(ele);
			return s1;
		}
		int x = (int) s1.peek();
		s1.pop();
		PB(s1, ele);
		s1.push(x);				
		return s1;
	}
}
