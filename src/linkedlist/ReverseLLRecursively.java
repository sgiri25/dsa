package linkedlist;

public class ReverseLLRecursively {
	Node head, tail;
	int size;
	
	ReverseLLRecursively(){
		head=tail=null;
		size=0;
	}
	
	static class Node {
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void createLL(int data) {
		Node new_node = new Node(data);
		if(head == null && tail == null) {
			head=tail=new_node;
		}else {
			tail.next = new_node;
			tail = tail.next;
			
		}
		size++;
	}
	
	public static void printLL(ReverseLLRecursively RLR) {
		Node tmp = RLR.head;
		
		while(tmp != null) {
			System.out.print(tmp.data+ " ");
			tmp = tmp.next;
		}
	}
	
	public static Node recursiveLL(Node head) {
		
		Node prev = null;
		Node curr = head;
		//System.out.println(curr.next.data);
		//System.out.println(curr.next.next.data);
		if(curr.next == null || curr == null) {
			
			return head;
		}
		Node tmp = curr.next;
		
		curr.next = null;
		Node new_head = recursiveLL(tmp);
		//System.out.println(tmp.data);
		//new_head.next = tmp;
		//curr.next = prev;
		tmp.next = curr;
		
		return new_head;
		
		
	}
	
	public static void main(String args[]) {
		ReverseLLRecursively ll1 = new ReverseLLRecursively();
		ll1.createLL(1);
		ll1.createLL(2);
		ll1.createLL(3);
		ll1.createLL(4);
		ll1.createLL(5);
		ll1.createLL(6);
		
		
		
		Node reversed = recursiveLL(ll1.head);
		while (reversed != null) {
            System.out.print(reversed.data + " ");
            reversed = reversed.next;
        }
		//printLL(ll1);
	}
}
