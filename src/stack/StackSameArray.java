package stack;
import stack.Stack1;
import stack.Stack2;

public class StackSameArray {
	public static void main(String args[]) {
		int[] arr = new int[10];
		int n = arr.length;
		
		int top1 = -1,top2 = n;
		Stack1 st1 = new Stack1(top1, arr);
		Stack2 st2 = new Stack2(top2, arr);
		
		st1.push(10);
		st1.push(11);
		st2.push(12);
		st2.push(13);
		st2.push(14);
		st2.push(15);
		st2.push(116);
		st2.push(144);
		st2.push(155);
		st2.push(1166);
		st1.push(10);
		st1.push(111);
		st1.push(100);
		st1.push(112);
		
		//System.out.println(st1.top());
		//st1.pop();
		//System.out.println(st1.top());
		//st1.pop();
		//System.out.println(st1.top());
		System.out.println(st2.top());
		st2.pop();
		System.out.println(st2.top());
		st2.pop();
		System.out.println(st2.top());
		st2.pop();
		System.out.println(st2.top());
		st2.pop();
		System.out.println(st2.top());
	}
}
