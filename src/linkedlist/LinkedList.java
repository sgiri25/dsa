package linkedlist;

public class LinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		// Constructor
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	// Method to insert a new node
	public static LinkedList insert(LinkedList list, int data) {
		
		// Create a new node with given data
		Node new_node = new Node(data);
		
		// if the linked list is empty
		if(list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			
			// Insert the new node at last node
			last.next = new_node;
		}
		
		return list;
		
	}
	
	public static LinkedList deleteByKey(LinkedList list, int key) {
		Node currNode = list.head, prev = null;
		if(currNode != null && list.head.data == key) {
			System.out.println(list.head.next+"=="+currNode.next);
			list.head = currNode.next;
			return list;
		}
		while(currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		}
		
		if(currNode != null) {
			prev.next = currNode.next;
			// Display the message
            System.out.println(key + " found and deleted");
		}
		
		if (currNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }
		
		return list;
	}
	
	public static LinkedList deleteByPos(LinkedList list, int index) {
		Node currNode = list.head, prev = null;
		if(index == 0 && currNode != null) {
			list.head = currNode.next;
			return list;
		}
		
		int counter = 0;
		while(currNode != null) {
			if(counter == index) {
				prev.next = currNode.next;
				// Display the message
                System.out.println(
                    index + " position element deleted");
                break;
			}else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}
		}
		return list;
		
	}
	
	public static void printList(LinkedList list) {
		Node currNode = list.head;
		System.out.println("Linked List::");
		
		while(currNode != null) {
			System.out.println(currNode.data+ " ");
			
			// Go to next node
			currNode = currNode.next;
		}
		
		
	}
	
	public static void main(String args[]) {
		/* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        //printList(list); 
        
     // Delete node with value 1
        // In this case the key is ***at head***
        deleteByKey(list, 1);
        
     // Print the LinkedList 
        printList(list); 
	}
}
