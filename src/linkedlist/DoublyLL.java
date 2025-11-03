package linkedlist;

class DoublyNode {
	int data;
	DoublyNode prev;
	DoublyNode next;
	
	public DoublyNode(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
public class DoublyLL {
	DoublyNode head;
	DoublyNode tail;
	
	public DoublyLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void insertAtBeginning(int data) {
		DoublyNode temp = new DoublyNode(data);
		DoublyNode tmp = head;
		if(head == null) {
			head = temp;
			tail = temp;
		}else {
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
	}
	
	public void insertAtPosition(int data, int position) {
		DoublyNode temp_data = new DoublyNode(data);
		DoublyNode curr = head;
		//DoublyNode curr = null;
		for(int i = 0; i < position - 1; i++) {
			curr = curr.next;
		}
		System.out.println(curr.data);
		//DoublyNode tmp = curr.next;
		//curr.next = temp_data;
		temp_data.prev = curr.prev;
		temp_data.next = curr;
		curr.prev.next = temp_data;
		curr.prev = temp_data;
	}
	
	public void insertAtEnd(int data) {
		DoublyNode temp = new DoublyNode(data);
		if(tail == null) {
			head = temp;
			tail = temp;
		}else {
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
	}
	
	// Traversing from head to the end of the list
	public void traverseForward()
	{
		DoublyNode current = head;
	    while (current != null) {
	        System.out.print(current.data + " ");
	        current = current.next;
	    }
	}
	// Traversing from tail to the head
	public void traverseBackward()
	{
		DoublyNode current = tail;
	    while (current != null) {
	        System.out.print(current.data + " ");
	        current = current.prev;
	    }
	}
	
	public static void main(String args[]) {
		DoublyLL dll = new DoublyLL();
		dll.insertAtBeginning(1);
		dll.insertAtBeginning(10);
		dll.insertAtBeginning(21);
		dll.insertAtBeginning(11);
		dll.insertAtBeginning(13);
		dll.insertAtBeginning(15);
		
		dll.insertAtPosition(89, 6);
		dll.insertAtEnd(100);
		
		dll.traverseForward();
		//dll.traverseBackward();
	}
}
