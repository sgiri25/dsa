package stack;

import java.util.Stack;

public class PushBottom {
	public static void main(String args[]) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		
		Stack s2 = PB(s1, 4);
		System.out.println(s2);
	}
	
	public static Stack<Integer> PB(Stack<Integer> s1, int ele) {
		
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
