package stack;

import java.util.Stack;

public class LAR {
	public static void main(String args[]) {
		int[] arr = {6,2,5,4,5,1,6};
		int n = arr.length;
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(0);
		
		int nse = NSE(n, arr, s1);
		System.out.println("NSE-->"+nse);
		int pse = PSE(n, arr, s1);
		System.out.println("PSE-->"+pse);
	}
	
	public static int NSE(int n, int[] arr, Stack<Integer> s1) {
		int min=n;
		for(int i = 1; i < n; i++) {
			while(!s1.empty() && arr[i] <= arr[s1.peek()]) {
				min = Math.min(arr[s1.peek()], arr[i]);
				s1.pop();
			}
			s1.push(i);
		}
		return min;
	}
	
	public static int PSE(int n, int[] arr, Stack<Integer> s1) {
		int min=0;
		for(int i = n-2; i >= 0; i--) {
			while(!s1.empty() && arr[i] <= arr[s1.peek()]) {
				min = Math.min(arr[s1.peek()], arr[i]);
				s1.pop();
			}
			s1.push(i);
		}
		
		return min;
	}
}
