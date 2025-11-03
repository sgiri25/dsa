package binarytree;

import java.util.ArrayList;
import java.util.List;

class Node {
	int data;
	Node left, right;
	Node(int d){
		data = d;
		left=null;
		right=null;
	}
}
public class CreateTree {
	Node root;
	public static Boolean isFullTree(Node node) {
		if(node == null) {
			return true;
		}
		if(node.left == null && node.right == null) {
			return true;
		}
		if(node.left != null && node.right != null) {
			return ( isFullTree(node.left) && isFullTree(node.right));
		}
		return false;
	}
	
	public static int countNode(Node root) {
		if(root == null) {
			return 0;
		}
		
		return 1 + countNode(root.left)+countNode(root.right);
	}
	public static int countLeafNode(Node root) {
		if(root == null) return 0;
		//System.out.println("SGIRI-->"+root.left.data+"=="+root.right.data);
		if(root.left == null && root.right == null) {
			
			return 1;
		}
		return countLeafNode(root.left) + countLeafNode(root.right);
		
	}
	
	public static void mirrorTree(Node root) {
		if(root == null) return ;
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirrorTree(root.left);
		mirrorTree(root.right);
//		if(root.left != null) {
//			System.out.println(">>>"+root.left.data);
//		}
//		if(root.right != null) {
//			System.out.println(">>"+root.right.data);
//		}
		
		
	}
	
	private static Boolean isSymmetricUtil(Node r1, Node r2) {
		if(r1 == null || r2 == null) {
			return r1 == r2;
		}
		
		return (r1.data == r2.data) && isSymmetricUtil(r1.left, r2.right) && isSymmetricUtil(r1.right, r2.left);
	}
	
	public static Boolean symmetricTree(Node root) {
		if(root == null) {
			return true;
		}
		return isSymmetricUtil(root.left, root.right);
	}
	
	public static int heightTree(Node root) {
		if(root == null) return 0;
		int lh = heightTree(root.left);
		int rh = heightTree(root.right);
		return 1 + Math.max(lh, rh);
		//return 0;
	}
	
	public static int minHeight(Node root) {
		if(root == null) { return Integer.MAX_VALUE; }
		int lh = heightTree(root.left);
		int rh = heightTree(root.right);
		return 1 + Math.min(lh, rh);
	}
	
	public static int minHeightTree(Node root) {
		if(root == null) {
			return 0;
		}else {
			return minHeight(root);
		}
	}
	
	public static void PrintRootToLeafPaths(Node root, ArrayList<Integer> arr) {
		
		if(root == null) {
			return;
		}
		arr.add(root.data);
		if(root.left == null && root.right == null) {
			System.out.println(arr);
		}else {
			PrintRootToLeafPaths(root.left, arr);
			PrintRootToLeafPaths(root.right, arr);
		}
		arr.remove(arr.size()-1);
	}
	
	public static int getDiameter(Node root) {
		if(root == null) {
			return 0;
		}
		
		return Math.max(1 + heightTree(root.left)+heightTree(root.right), Math.max(getDiameter(root.left),getDiameter(root.right)));
	}
	
	public static int chkBalancedTree(Node root, Boolean ans) {
		if(root == null) return 0;
		int lh = chkBalancedTree(root.left, ans);
		int rh = chkBalancedTree(root.right, ans);
		
		if(Math.abs(lh-rh) > 1) {
			ans = false;
		}
		System.out.println(ans);
		return 1 + Math.max(lh, rh);
		
	}
	
	public static int MaxSumPath(Node root, int[] maxi) {
		if(root == null) return 0;
		
		// calculate the max path for the left and right subtrees
		int leftMaxPath = Math.max(0, MaxSumPath(root.left, maxi));
		int rightMaxPath = Math.max(0, MaxSumPath(root.right, maxi));
		
		// Update the overall maxi
		
		maxi[0] = Math.max(maxi[0], leftMaxPath + rightMaxPath+root.data);
		
		return Math.max(leftMaxPath, rightMaxPath) + root.data;
	}
	
	public static Node[] BinToDLL(Node root) {
		Node[] arr = {null, null};
		if(root == null) {
			return arr;
		}
		
		Node[] lst = BinToDLL(root.left);
		Node[] rst = BinToDLL(root.right);
		
		Node head = root;		
		Node tail = root;
		
		
		root.left = lst[1];
		if(lst[1] != null) {
			lst[1].right = root;
			head = lst[0];
		}
		
		root.right = rst[0];
		if(rst[0] != null) {
			rst[0].left = root;
			tail = lst[1];
		}
		arr[0] = head;
		arr[1] = tail;
		
		return arr;
		
//		List<Object> values = new ArrayList<>();
//        
//		if(root == null) {
//			values.add(null);
//	        values.add(null);
//			return values;
//		}
//		
//		List<Object> lst  = BinToDLL(root.left);
//		List<Object> rst  = BinToDLL(root.right);
//		
//		Node head = root;
//		values.add(head);
//		Node tail = root;
//		values.add(tail);
//		//System.out.println(lst);
//		root.left = (Node) lst.get(1);
//		if(lst.get(1) != null) {
//			Node tmp = (Node) lst.get(1);
//			tmp.right = root;
//			head = (Node) lst.get(0);
//			
//			
//		}
//		
//		root.right = (Node) lst.get(0);
//		if(lst.get(0) != null) {
//			Node tmp = (Node) lst.get(0);
//			tmp.left = root;
//			tail = (Node) lst.get(1);
//			
//		}
//		
//		return values;
		
	}
	
	
	
	  public static void printTree(Node head)
	    {
	        while (head != null)
	        {
	            System.out.println(head.data);
	            head = head.right;
	        }
	    }
	
	public static void main(String args[]) {
		CreateTree ct = new CreateTree();
		ct.root = new Node(2);
		ct.root.left = new Node(3);
		ct.root.left.right = new Node(3);
		ct.root.left.left = new Node(4);
		ct.root.left.left.right = new Node(4);
		ct.root.left.left.left = new Node(7);
		
		System.out.println(isFullTree(ct.root));
		System.out.println(countNode(ct.root));
		System.out.println(countLeafNode(ct.root));
		mirrorTree(ct.root);
		System.out.println(symmetricTree(ct.root));
		System.out.println(heightTree(ct.root));
		System.out.println(minHeightTree(ct.root));
		ArrayList<Integer> arr = new ArrayList<>();
		PrintRootToLeafPaths(ct.root, arr);
		System.out.println(getDiameter(ct.root));
		Boolean ans = true;
		chkBalancedTree(ct.root, ans);
		System.out.println(ans);
		
		int[] maxi = {Integer.MIN_VALUE};
		MaxSumPath(ct.root, maxi);
		System.out.println( maxi[0]);
		
		printTree(BinToDLL(ct.root)[0]);
		//System.out.println(BinToDLL(ct.root).get(1));
		//printTree((Node) BinToDLL(ct.root).get(0));
		
		//Node root = new Node(2);
		//Node secondNode = new Node(3);
		//Node thirdNode = new Node(4);
		//Node fourthNode = new Node(5);
		//Node fifthNode = new Node(6);
		
		//root.left = secondNode;
		//root.right = thirdNode;
		//secondNode.left = fourthNode;
		//secondNode.right = fifthNode;
		
		
	}

}
