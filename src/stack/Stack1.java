package stack;

public class Stack1 {
	private int top;
	private int[] arr;
	Stack1(int top1, int[] arr1){
		top = top1;
		arr = arr1;
	}
	public boolean isFull(){
		return top == 4;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack1 is full");
		}else {
			arr[++top] = item;
		}
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			System.out.println("Pooped"+arr[top--]);
			return arr[top--];
		}
		
	}
	public int top() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			System.out.println("TEST");
			return arr[top];
		}
		
	}
}
