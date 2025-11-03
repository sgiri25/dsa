package stack;

public class Stack2 {
	private int top;
	private int[] arr;
	Stack2(int top1, int[] arr1){
		top = top1;
		arr = arr1;
	}
	public boolean isFull(){
		//System.out.println(top/);
		return top == 5;
	}
	public boolean isEmpty() {
		return top == arr.length;
	}
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack2 is full");
		}else {
			arr[--top] = item;
		}
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack2 is empty");
			return -1;
		}else {
			return arr[top++];
		}
		
	}
	public int top() {
		if(isEmpty()) {
			System.out.println("Stack2 is empty");
			return -1;
		}else {
			System.out.println(top);
			return arr[top];
		}
		
	}
}
