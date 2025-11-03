package linkedlist;

import java.util.HashMap;
import java.util.Scanner;

import linkedlist.CircularLL.Node;

public class Circular_LL {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next=null;
		}
	}
		
		Node head = null;
		Node tail = null;
		public Node creation() {
			int data, n, m, p;
			Scanner sc = new Scanner(System.in);
			do
			{
				System.out.print("Enter data");
				data = sc.nextInt();
				Node new_node = new Node(data);
				if(head==null) {
					tail = new_node;
					head = new_node;
					new_node.next = head;
				}else {
					Node temp = head;
					while(temp.next != head) {
						temp = temp.next;
					}
					temp.next = new_node;
					new_node.next = head;
					head = new_node;
					//break;
				}
				System.out.print("Do you want add more data. If yes press 1");
				n = sc.nextInt();
			}while(n==1);
			return head;
			//traverse(head);
		}
		
		public void traverse(Node head) {
			Node tmp = head;
			if(head == null) {
				System.out.println("LL does not exists");
			}else {
				
				do {
					
					System.out.print(tmp.data + " ");
					tmp = tmp.next;
					if(tmp == head) {
						break;
					}
					System.out.print(" -> ");
				}while(tmp != head);
				
			}
			//System.out.println(tail.next.data);
		}
		
		public void insertByPos(int data, int pos) {
			Node temp = head;
			Node new_node = new Node(data);
			for(int i = 0; i < pos-1; i++) {
				temp = temp.next;
				
			}
			new_node.next = temp.next;
			temp.next = new_node;
			//System.out.println(tail.data);
			tail = new_node;
			//tail.next = head;
			
			
		}
		
		public Node deletionByBegining() {
			Node temp = head;
			temp = temp.next;
			head = temp;
			tail.next = head;
			return head;
		}
		
		public Node deletionByEnd() {
			Node temp = head;
			Node ptr = temp.next;
			
			while(ptr.next != head) {
				temp = ptr;
				ptr = ptr.next;
				
			}
			temp.next = head;
			tail = temp;
			return head;
		}
		
		public Node deletionByPos(int pos) {
			Node temp = head;
			for(int i = 0; i < pos-1; i++) {
				temp = temp.next;				
			}
			temp.next = temp.next.next;
			return head;
		}
		public Boolean isCyclic() {
			Node temp = head;
			HashMap<Node, Boolean> hashMap = new HashMap<>();
			while(temp != null) {
				if(hashMap.containsKey(temp)) {
					return true;
				}
				hashMap.put(temp, true);
				temp = temp.next;
			}
			return false;
			
		}
		public Boolean isCyclic1() {
			Node slow = head, fast = head;
			while(fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast) {
					return true;
				}
				
			}
			return false;
			
		}
		
		public Node isCyclicFirstNode() {
			Node slow = head, fast = head;
			Boolean hasCycle = false;
			
			while(fast != null && fast.next != null ) {
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast) {
					hasCycle = true;
					break;
				}
			}
			if(!hasCycle) return null;
			Node p = head;
			while(true) {
				Node tmp = slow;
				while(tmp != p) {
					tmp = tmp.next;
					if(tmp == slow) break;
				}
				if(tmp == p) {
					return tmp;
				}
				p = p.next;
			}
			//return null;
		}
		
		public static void main(String args[]) {
			Node head = null;
			Circular_LL cll = new Circular_LL();
			head = cll.creation();
			cll.traverse(head);
			cll.insertByPos(9,3);
			cll.traverse(head);
			//head = cll.deletionByBegining();
			//head = cll.deletionByEnd();
			//head = cll.deletionByPos(5);
			//System.out.println(head.data);
			System.out.println(cll.isCyclicFirstNode().data);
			//cll.traverse(head);
		}
}

