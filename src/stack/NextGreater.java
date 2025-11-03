package stack;

import java.util.Stack;

public class NextGreater {
	public static void main(String args[]) {
		int[] arr = {4,5,2,25};
		int[] NGE = new int[arr.length];
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(0);
		for(int i = 1; i < arr.length; i++) {
			while(!s1.isEmpty() && arr[i] > arr[s1.peek()]) {
					NGE[s1.peek()] = arr[i];
					s1.pop();
			}
			//System.out.println(s1);
					
			
			s1.push(i);
				
			
		}
		
		while(!s1.isEmpty()) {
			NGE[s1.peek()] = -1;
			s1.pop();
		}
		
		for(int i = 0; i < NGE.length; i++) {
			System.out.println(NGE[i]);
		}
		
	}
}
