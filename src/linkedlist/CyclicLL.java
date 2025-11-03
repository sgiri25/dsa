package linkedlist;

import linkedlist.KReverse.Node;

public class CyclicLL {
	Node head, tail;
	int size  = 0;
	CyclicLL(){
		head=tail=null;
	}
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
		
	}
	
	public void createLL(int d) {
		Node new_node = new Node(d);
		if(head == null && tail == null ) {
			head=tail=new_node;
		}else {
			tail.next = new_node;
			tail = tail.next;
		}
	}
	
	public static void printLL(CyclicLL cp ) {
		Node head = cp.head;
		while(head != null) {
			System.out.print(head.data+ " ");
			head = head.next;
		}
		
	}
	public static void main(String args[]) {
		
	}
}
