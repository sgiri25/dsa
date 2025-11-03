package linkedlist;

//import linkedlist.CheckPalindrom.Node;

public class KReverse {
	Node head, tail;
	int size  = 0;
	KReverse(){
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
	
	public static void printLL(KReverse cp ) {
		Node head = cp.head;
		while(head != null) {
			System.out.print(head.data+ " ");
			head = head.next;
		}
		
	}
	
	public static Node kRev(Node head, int k) {
		int cnt = 0;
		Node curr = head;
		while(curr != null && cnt < k) {
			cnt++;
			curr = curr.next;
		}
		if(cnt < k) {
			return head;
		}
		//System.out.println(head.data);
		curr = head;
		Node prev = null;
		Node tmp;
		cnt = 0;
		
		while(cnt < k) {
			tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
			//System.out.println(curr.data);
			cnt++;
		}
		//System.out.println(cnt);
		head.next = kRev(curr,k);
		
		
		return prev;
	}
	public static void main(String args[]) {
		KReverse cp = new KReverse();
		cp.createLL(0);
		cp.createLL(1);
		cp.createLL(2);
		cp.createLL(4);
		cp.createLL(7);
		cp.createLL(9);
		cp.createLL(11);
		cp.createLL(12);
		
		
		int k = 3;
		kRev(cp.head, k);
		printLL(cp);
	}
}
