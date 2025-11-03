package binary_search_tree;

class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
    
    
}
public class SearchNode {
	public static boolean Search(Node root, int key) {
    	Node node = root;
    	while(node != null) {
    		if(node.key == key) {
    			return true;
    		}else if(key < node.key) {
    			node = node.left;
    			//return Search(node, key);
    			//return node;
    		}else {
    			node = node.right;
    			//return Search(node, key);
    			//return node;
    		}
    	}
    	return false;
    }
	
	static Node Insert(Node root, int k) {
		if(root == null) {
			return new Node(k); 
		}
		Node par = null;
		Node node = root;
		
		while(node != null) {
			par = node;
			if(k > node.key) {
				node = node.right;
			}else {
				node = node.left;
			}
		}
		if(k > par.key) {
			par.right = new Node(k);
		}else {
			par.left = new Node(k);
		}
		return root;
	}
	public static void main(String args[]) {
		Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        
        //System.out.println(Search(root, 40).key);
        System.out.println(Search(root, 45));
        Insert(root, 35);
        System.out.println(Search(root, 35));
	}
}
