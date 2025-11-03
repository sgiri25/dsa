package stack;

import java.util.Stack;

public class SumOfMin1 {
	public static void main(String args[]) {
		//int[] arr = {6,1,8,5,7,9,10,6,4,2};
		int[] arr = {2,1,5,9};
		int[] NSE = new int[arr.length];
		int[] PSE = new int[arr.length];
		int n = arr.length;
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(0);
		
		for(int i = 1; i < n; i++) {
			while(!s1.empty() && arr[i] < arr[s1.peek()]) {
				NSE[s1.peek()] = i;
				s1.pop();
			}
			s1.push(i);
		}
		System.out.println(s1);
		
		while(!s1.isEmpty()) {
			NSE[s1.peek()] = arr.length;
			s1.pop();
		}
		
		for(int i = 0; i < NSE.length; i++) {
			System.out.println(NSE[i]);
		}
		
		s1.clear();
		s1.push(n-1);
		
		for(int i = n-2; i >= 0; i--) {
			while(!s1.empty() && arr[i] <= arr[s1.peek()]) {
				PSE[s1.peek()] = i;
				s1.pop();
			}
			s1.push(i);
		}
		
		while(!s1.isEmpty()) {
			PSE[s1.peek()] = -1;
			s1.pop();
		}
		
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			ans += (NSE[i] - i) * (i-PSE[i]) * arr[i];
			System.out.println("Loop Ans-->"+ans);
		}
		
		System.out.println("ANS-->"+ans);
		
		for(int i = 0; i < PSE.length; i++) {
			System.out.println(PSE[i]);
		}
		
		
		
	}
}
