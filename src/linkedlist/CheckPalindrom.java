package linkedlist;

import java.util.Stack;

import linkedlist.ReverseLLRecursively.Node;

public class CheckPalindrom {
	Node head, tail;
	int size  = 0;
	CheckPalindrom(){
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
	
	public static void printLL(CheckPalindrom cp ) {
		Node head = cp.head;
		while(head != null) {
			System.out.print(head.data+ " ");
			head = head.next;
		}
		
	}
	
	public static boolean chkPal(CheckPalindrom cp ) {
		Stack<Integer> st = new Stack<>();
		Node head = cp.head;
		
		while(head != null) {
			st.add(head.data);
			head = head.next;
		}
		
		head = cp.head;
		
		while(head != null) {
			if(head.data == st.peek()) {
				st.pop();				
			}else {
				return false;
			}
			head = head.next;
		}
		return true;
	}
	
	public static Node reverse(Node head) {
		
		Node prev = null;
		Node curr = head;
		//System.out.println(curr.next.data);
		//System.out.println(curr.next.next.data);
		if(curr.next == null || curr == null) {
			
			return head;
		}
		Node tmp = curr.next;
		
		curr.next = null;
		Node new_head = reverse(tmp);
		//System.out.println(tmp.data);
		//new_head.next = tmp;
		//curr.next = prev;
		tmp.next = curr;
		
		return new_head;
	}
	
	public static boolean chkPalRev(CheckPalindrom cp ) {
		Node slow = cp.head;
		Node fast = cp.head;
		Node start_node = cp.head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;	
			System.out.print(fast.data + " ");
		}
		
		Node tmp = slow.next;
		slow.next = null;
		Node reversed = reverse(tmp);
		
		while (reversed != null) {
            
            if(start_node.data == reversed.data) {
            	reversed = reversed.next;
            	start_node = start_node.next;
            }else {
            	return false;
            }
            
        }
		return true;
		
	}
	
	public static void main(String args[]) {
		CheckPalindrom cp = new CheckPalindrom();
		cp.createLL(1);
		cp.createLL(0);
		cp.createLL(3);
		cp.createLL(3);
		cp.createLL(0);
		cp.createLL(1);
		cp.createLL(6);
		
		printLL(cp);
		if(chkPal(cp)) {
			System.out.println("\nLL is palindrome");
		}else {
			System.out.println("\nLL is not palindrome");
		}
		
		if(chkPalRev(cp)) {
			System.out.println("\nLL is palindrome");
		}else {
			System.out.println("\nLL is not palindrome");
		}
		
	}
}
