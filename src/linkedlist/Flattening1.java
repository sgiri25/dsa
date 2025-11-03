package linkedlist;
class Node1 {
    int data;
    Node1 next, bottom;

    Node1(int newData) {
        data = newData;
        next = bottom = null;
    }
}

public class Flattening1 {
	public static Node1 flatteningLL(Node1 head) {
		Node1 tmp = head;
		while(tmp != null) {
			Node1 n1 = tmp.next;
			Node1 b_temp = tmp.bottom;
			if(b_temp != null) {
				while(b_temp != null) {
					int data1 = b_temp.data;
					tmp.next = new Node1(data1);
					b_temp = b_temp.bottom;
					tmp = tmp.next;
				}
				tmp.next = n1;
				
			}
			//System.out.println(tmp.next.data);
			tmp = tmp.next;
		}
		
		return head;
		
	}
	public static void printLL(Node1 head) {
		Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
	}
	public static void main(String args[]) {
		Node1 head = new Node1(5);
        head.bottom = new Node1(7);
        head.bottom.bottom = new Node1(8);
        head.bottom.bottom.bottom = new Node1(30);

        head.next = new Node1(10);
        //head.next.bottom = new Node1(20);

        head.next.next = new Node1(19);
        //head.next.next.bottom = new Node1(22);
        //head.next.next.bottom.bottom = new Node1(50);
        
        Node1 fhead = flatteningLL(head);
        printLL(fhead);
        
	}
}
