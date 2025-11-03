package linkedlist;

public class CircularLL {
	private static Node head = null;
	//static Node next;
	private static Node tail;
	//public static int data;
	static class Node{
		public Node next;
		public int data;

		//int data;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public static void createCirular(int d) {
		Node new_node = new Node(d);
		Node tmp = head;
		if(head == null) {
			tail = new_node;
			head = new_node;
			new_node.next = head;
		}else {
			new_node.next = head;
			head = new_node;
			
		}
	}
	public static void traverse() {
		//System.out.println("LL does not exists"+head.next.next.data);
		Node tmp = head;
		//System.out.println(tmp);
		//System.out.println(tmp);
		if(head == null) {
			System.out.println("LL does not exists");
		}else {
			
			do {
				System.out.print(tmp.data + "");
				
				System.out.println(head);
				tmp = tmp.next;
				System.out.println(tmp);
			}while(tmp != head);
		}
		
	}
	public static void main(String args[]) {
		CircularLL cll = new CircularLL();
		cll.createCirular(1);
		cll.createCirular(2);
		cll.createCirular(3);
		cll.createCirular(4);
		cll.createCirular(5);
		
		traverse();
		
	}
}
