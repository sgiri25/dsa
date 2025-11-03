package binarytree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Node2 {
	  int item;
	  Node2 left, right;

	  public Node2(int key) {
	  item = key;
	  left = right = null;
	  }
	}

public class Traversal {
	Node2 root;
	Traversal() {
		root = null;
	}
	void postOrder(Node2 node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.item + "->");
	}
	
	void inOrder(Node2 node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.item + "->");
		inOrder(node.right);
	}
	void preOrder(Node2 node) {
		if(node == null) {
			return;
		}
		System.out.print(node.item + "->");
		preOrder(node.left);
		preOrder(node.right);
		
	}
	
	List<Integer> iterativePreOrder(Node2 node) {
		List<Integer> res = new ArrayList<>();
		if(node == null) {
			return res;
		}
		
		Stack<Node2> stk = new Stack<>();
		stk.push(node);
		while(!stk.empty()) {
			Node2 curr = stk.peek();
			res.add(curr.item);
			stk.pop();
			System.out.print(curr.item + "->");
			if(curr.right != null) {
				stk.push(curr.right);
			}
			if(curr.left != null) {
				stk.push(curr.left);
			}
		}
		return res;
	}
	void LevelOrderTraversal(Node2 node) {
		Queue<Node2> ll = new LinkedList<Node2>();
		ll.add(node);
		while(!ll.isEmpty()) {
			Node2 n = ll.peek();
			ll.remove();
			System.out.print(n.item + "->");
			if(n.left != null) {
				ll.add(n.left);
			}
			if(n.right != null) {
				ll.add(n.right);
			}
		}
	}
	class StudentComparator implements Comparator<MyPair>{
	      
	      public int compare(MyPair s1, MyPair s2) {
	        if (s1.value < s2.value)
	          return s1.node;
	        else if (s1.cgpa > s2.cgpa)
	          return -1;
	                return 0;
	        }
	}
    // Custom Pair class
    static class MyPair<N, K, V> {
    	private final N node;
        private final K key;
        private final V value;

        public MyPair(N node, K key, V value) {
        	this.node = node;
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
        
        public N getNode() {
        	return node;
        }

        @Override
        public String toString() {
            return "("+ node +", " + key + ", " + value + ")";
        }
    }
    void verticalTraversal(Node2 node, int l, int hd ) {
    	Queue<MyPair<Integer, Integer, Integer>> queue = new LinkedList<MyPair<Integer, Integer, Integer>>((Collection<? extends MyPair<Integer, Integer, Integer>>) new StudentComparator());
		if(node == null) {
			//queue.add(new MyPair<>(null, null, null));
			return;
		}
		
		
		queue.add(new MyPair<>(node.item, l, hd));
    	if(node.left != null) {
    		verticalTraversal(node.left, l+1, hd-1);
    	}
    	//queue.add(new MyPair<>(node.item, l+1, hd-1));
        if(node.right != null) {
        	verticalTraversal(node.right, l+1, hd+1);
        }
        
		for (MyPair<Integer, Integer, Integer> pair : queue) {
		      System.out.println(pair);
		}
        
        //queue.add(new MyPair<>(node.item, l+1, hd+1));
        	
        	
        	
        	//System.out.println(queue.poll().getNode()); 
        //}
        //return queue;
        //System.out.println(queue.poll().getValue()); 
		
	}
	public static void main(String args[]) {
		Traversal tree = new Traversal();
		tree.root = new Node2(1);
		tree.root.left = new Node2(12);
		tree.root.right = new Node2(9);
		tree.root.left.left = new Node2(5);
		tree.root.left.right = new Node2(6);
		tree.postOrder(tree.root);
		System.out.println("\n");
		tree.inOrder(tree.root);
		System.out.println("\n");
		tree.preOrder(tree.root);
		System.out.println("\n");
		tree.iterativePreOrder(tree.root);
		System.out.println("\n");
		tree.LevelOrderTraversal(tree.root);
		System.out.println("\n");
		int l = 0;
		int hd = 0;
		tree.verticalTraversal(tree.root, l, hd);
//		Queue<MyPair<Integer, Integer, Integer>> pairQueue = tree.verticalTraversal(tree.root, l, hd);
//		for (MyPair<Integer, Integer, Integer> pair : pairQueue) {
//            System.out.println(pair);
//        }

	}
}
