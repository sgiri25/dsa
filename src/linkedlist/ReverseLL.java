package linkedlist;

public class ReverseLL {
	Node head, tail;
	int size;
	
	ReverseLL(){
		head=tail=null;
		size = 0;
	}
	
	static class Node{
		int data;
		Node next;
		public Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void createLL(int data) {
		Node new_node = new Node(data);
		if(head == null) {
			head=tail= new_node;
		}else {
			tail.next = new_node;
			tail = tail.next;
		}
		
		
	}
	
	public void printLL(ReverseLL ll1) {
		Node curr = ll1.head;
		
		while(curr != null) {
			System.out.print(curr.data+ " ");
			curr = curr.next;
		}
	}
	
	public void reverse(ReverseLL ll1) {
		Node curr = ll1.head;
		Node prev = null;
		Node tmp;
		while(curr != null) {
			tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
			//System.out.print(curr.data+ " ");
		}
		ll1.head = prev;
	}
	
	public static void main(String args[]) {
		ReverseLL ll1 = new ReverseLL();
		ll1.createLL(1);
		ll1.createLL(2);
		ll1.createLL(3);
		ll1.createLL(4);
		ll1.createLL(5);
		ll1.createLL(6);
		ll1.reverse(ll1);
		ll1.printLL(ll1);
		
	}
	
}
