package linkedlist;
class Node {
    int data;
    Node next, bottom;

    Node(int newData) {
        data = newData;
        next = bottom = null;
    }
}

public class FlatteningLL {
	public static Node flatteningLL(Node head) {
		Node tmp = head;
		while(tmp != null) {	
			//System.out.print(tmp.next.next.data + " ");
			Node chkBtm = tmp.bottom;
			
			Node bottomTop = tmp.bottom;
			System.out.println("chk-->"+chkBtm+"=="+bottomTop+"=="+tmp);
			Node t2 = null;
			if(chkBtm != null) {
				
				t2 = tmp.next;
				System.out.println(tmp.data+"==>>"+ tmp.next+"==>>"+);
			}
			while(bottomTop != null) {				
				tmp.next = bottomTop;
				System.out.println(bottomTop.data+"--"+bottomTop.bottom);
				if(bottomTop.bottom == null) {
					System.out.println("SGIRI");
					bottomTop.bottom = t2;
					break;
				}
				bottomTop = bottomTop.bottom;
				
			}
			tmp = tmp.next;
		}
		
		return head;
		
	}
	public static void printLL(Node head) {
		Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.bottom;
        }
        System.out.println();
	}
	public static void main(String args[]) {
		Node head = new Node(5);
        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);
        head.bottom.bottom.bottom = new Node(30);

        head.next = new Node(10);
        head.next.bottom = new Node(20);

        head.next.next = new Node(19);
        head.next.next.bottom = new Node(22);
        head.next.next.bottom.bottom = new Node(50);
        
        Node fhead = flatteningLL(head);
        printLL(fhead);
        
	}
}
