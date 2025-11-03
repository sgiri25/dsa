package linkedlist;


public class LinkedList1 {
	Node head, tail;
	int size;
	
	LinkedList1(){
		head=tail=null;
		size=0;
	}
	
	static class Node{
		int data;
		Node next;
		
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	public void addLast(int d) {
		Node new_node = new Node(d);
		if(head==null) {
			head=tail=new_node;
		}else {
			tail.next = new_node;
			tail=new_node;
		}
	}
	public void printList(LinkedList1 list1 ) {
		//System.out.println(list1.head.data);
		while(list1.head != null) {
			System.out.print(list1.head.data+" ");
			list1.head = list1.head.next;
		}
	}
	public void deleteFirst(LinkedList1 list1) {
		Node tmp = list1.head;
		list1.head = tmp.next;
		
	}
	public void deleteLast(LinkedList1 list1) {
		if(list1.head == null) {
			return;
		}
		
		if(list1.head.next == null) {
			list1.head = null;
			return;
		}
		
		Node current = list1.head;
		Node prev = null;
		
		while(current.next != null) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
	}
	
	public LinkedList1 deleteMiddle(LinkedList1 list1) {
		int cnt = 0;
		Node curr = list1.head;
		Node curr2 = list1.head;
		while(curr != null) {
			curr = curr.next;
			cnt++;
		}
		
		int middleIndex = cnt / 2;
		Node prev = null;
		
		for(int i = 0; i < middleIndex; i++) {
			prev = curr2;
			curr2 = curr2.next;
		}
		System.out.println(prev.data);
		prev.next = prev.next.next;
		//System.out.println(prev.data);
		return list1;
	}
	
	public LinkedList1 deleteByKey(LinkedList1 list1, int key) {
		Node curr = list1.head;
		
		Node prev = null;
		
		for(int i = 0; i < key; i++) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = prev.next.next;
		return list1;
		
	}
	
	public LinkedList1 InsertMiddle(LinkedList1 list1) {
		int cnt = 0;
		Node curr = list1.head;
		while(curr != null) {
			curr = curr.next;
			cnt++;
		}
		
		Node new_node = new Node(7);
		
		int middleIndex = cnt / 2;
		
		curr = list1.head;
		
		for(int i = 0; i < middleIndex; i++) {
			curr = curr.next;
		}
		
		new_node.next = curr.next;
		curr.next = new_node;
		
		return list1;
	}
	
	public LinkedList1 DeleteNthNodeFromEnd(LinkedList1 list1, int pos) {
		int cnt = 0;
		Node curr = list1.head;
		while(curr != null) {
			curr = curr.next;
			cnt++;
		}
		System.out.println(cnt);
		curr = list1.head;
		for(int i = 0; i < cnt - pos; i++) {
			curr = curr.next;
		}
		
		curr.next = curr.next.next;
		
		return list1;
		
	}
	
	public static void main(String args[]) {
//		Node node1 = new Node(1);
//		Node node2 = new Node(2);
//		Node node3 = new Node(3);
//		Node node4 = new Node(4);
//		Node node5 = new Node(5);
//		
//		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
//		
//		System.out.println(node1.data);
//		System.out.println(node1.next.data);
//		System.out.println(node1.next.next.data);
//		System.out.println(node2.next.data);
//		System.out.println(node3.data);
		
		LinkedList1 list1 = new LinkedList1();
		list1.addLast(1);
		list1.addLast(2);
		list1.addLast(3);
		list1.addLast(4);
		list1.addLast(5);
		list1.addLast(6);
		//list1.deleteFirst(list1);
		//list1.deleteLast(list1);
		//list1.deleteMiddle(list1);
		//list1.printList(list1.deleteMiddle(list1));
		//list1.printList(list1.deleteByKey(list1,3));
		//list1.printList(list1.InsertMiddle(list1));
		list1.printList(list1.DeleteNthNodeFromEnd(list1, 3));
	}
}
