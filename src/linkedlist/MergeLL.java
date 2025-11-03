package linkedlist;

import java.util.Scanner;

import linkedlist.Circular_LL.Node;

public class MergeLL {
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
		public Node creation(Node tmp_head) {
			int data, n, m, p;
			Node tmp = null;
			Scanner sc = new Scanner(System.in);
			do
			{
				System.out.print("Enter data");
				data = sc.nextInt();
				Node new_node = new Node(data);
				if(tmp_head==null) {
					//tail = new_node;
					tmp_head = new_node;
					tmp = tmp_head;
					//new_node.next = head;
				}else {
					tmp.next = new_node;
					tmp = tmp.next;
				}
				System.out.print("Do you want add more data. If yes press 1");
				n = sc.nextInt();
			}while(n==1);
			return tmp_head;
			//traverse(head);
		}
		
		public void traverse(Node head) {
			Node tmp = head;
			if(head == null) {
				System.out.println("LL does not exists");
			}else {
				
				while(tmp != null) {
					System.out.print(tmp.data+ " > ");
					tmp = tmp.next;
				}
				
			}
			
		}
		
		public Node MergeTwoLL(Node head, Node head1) {
			Node p1 = head;
			Node p2 = head1;
			Node tmp = null, tmp_head = null;
			
			if(p1 == null) {
				return p2;
			}
			
			if(p2 == null) {
				return p1;
			}
			
			
			
			while(p1 != null && p2 != null) {
				System.out.println(p1.data+ "<" + p2.data);
				if(p1.data <= p2.data) {
					System.out.println("IF-->"+p1.data);
					if(tmp == null) {
						tmp_head = p1;
						tmp = p1;
						p1 = p1.next;
					}else {
						tmp.next = p1;
						p1 = p1.next;
						tmp = tmp.next;
					}
					
				}else {
					System.out.println("ELSE-->"+p2.data);
					if(tmp == null) {
						tmp_head = p2;
						tmp = p2;
						p2 = p2.next;
					}else {
						tmp.next = p2;
						p2 = p2.next;
						tmp = tmp.next;
					}
					
				}
				
			}
			if (p1 != null) {
	            tmp.next = p1;
	        } else {
	            tmp.next = p2;
	        }
			//System.out.println(tmp.data);
			return tmp_head;
		}
		
		public Node MergeTwoLLRecursive(Node head, Node head1) {
			Node p1 = head;
			Node p2 = head1;
			Node tmp = null;
			Node m_head = null;
			//m_head.data = 0;
			//m_head.next = null;
			
			if(p1 == null) {
				return p2;
			}
			
			else if(p2 == null) {
				return p1;
			}
			
			if(p1.data <= p2.data) {
				if(m_head == null) {
					m_head = p1;
				}
				
				//p1 = p1.next;
				m_head.next = MergeTwoLLRecursive(p1.next, p2);
				
			}else {
				if(m_head == null) {
					m_head = p2;
				}
				//p2 = p2.next;
				m_head.next = MergeTwoLLRecursive(p1, p2.next);
			}
			
			return m_head;
		}
		
		
		
		public static void main(String args[]) {
			Node head = null, head1=null, head2=null;
			MergeLL cll = new MergeLL();
			head = cll.creation(head);
			cll.traverse(head);
			
			head1 = cll.creation(head1);
			cll.traverse(head1);
			
			
			//head2 = cll.MergeTwoLL(head, head1);
			head2 = cll.MergeTwoLLRecursive(head, head1);
			cll.traverse(head2);
		}
}
