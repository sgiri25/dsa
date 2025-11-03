package binary_search_tree;

import java.util.ArrayList;
import java.util.List;

class NodeD {
    int key;
    NodeD left, right;

    public NodeD(int item) {
        key = item;
        left = right = null;
    }
}

public class DeleteNode {
	//Node node1, node2;
	public class CustomPair<K, V> {
	    private final K key;
	    private final V value;

	    public CustomPair(K key, V value) {
	        this.key = key;
	        this.value = value;
	    }

	    public K getKey() {
	        return key;
	    }

	    public V getValue() {
	        return value;
	    }

	    @Override
	    public String toString() {
	        return "CustomPair{" +
	               "key=" + key +
	               ", value=" + value +
	               '}';
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        CustomPair<?, ?> that = (CustomPair<?, ?>) o;
	        if (!key.equals(that.key)) return false;
	        return value.equals(that.value);
	    }

	    @Override
	    public int hashCode() {
	        int result = key.hashCode();
	        result = 31 * result + value.hashCode();
	        return result;
	    }
	}
	
	static List<NodeD> getNodeAndParent(NodeD root, int key){
		NodeD node = root;

		NodeD par = null;

		while(node != null){

			if(node.key==key)
	
				break;
	
			par = node;
	
			if(key > node.key)
				node=node.right;
			else
				node=node.left;
		}
		List<NodeD> objectList = new ArrayList<>();
        objectList.add(node);
        objectList.add(par);
        return objectList; // Returns the populated list
	}
	
	boolean isLeaf(Node node){

		return(node.left != null && node.right != null);

	}
	
	Node deleteLeaf(Node node,  Node par){

		if(par.left==null)

			par.left=null;

		else

			par.right=null;

		return node;

	}
	
	boolean hasSingleChild(Node node){

	return (node.left == null && node.right != null) || (node.left != null && node.right == null);

	}
	
	Node deleteSingleChildNode(Node node, Node par){

		if(node.left){

		if(par.right==node)

		par.right=node.left;

		else 

		par.left=node.left;

		node.left=null;

		}

		else{

		if(par.right==node)

		par.right=node.right;

		else

		par.left=node.right;

		node.right=null;

		}

		return node;

		}
	
	Node deleteDoubleChildNode(Node node, Node par){

		Node parent = node;

		Node pred = node.right; //Maximum in LST = Inorder predecessor

		while(pred.right != null){

		parent=pred;

		pred=pred.right;

		}

		Node n1;

		if(isLeaf(pred))

		n1=deleteLeaf(pred, parent);

		else

		n1=deleteSingleChildNode(pred, parent);

		if(par == null && par.left==node) //checking par==NULL incase node to be deleted is root

		par.left=n1;

		else if(par == null)

		par.right=n1;

		n1.left=node.left;

		n1.right=node.right;

		return node;

		}
	
	Node deleteRoot(Node root){

		if(isLeaf(root)){

			delete(root);
	
			return null;

		}

		if(hasSingleChild(root)){

			Node ans = root.left != null ?root.left : root.right;
	
			delete(root);
	
			return ans;

		}

		Node ans = root.left;

		while(ans.right != null){

		ans = ans.right;

		Node node = deleteDoubleChildNode(root, null);

		delete(node);

		}

		return ans;

		}

	Node deleteNodeBST(Node root, int key){

		Node P = getNodeAndParent(root, key);

		if(P.) //Node to be deleted doesn’t exist

		return root;

		if(P.first==root)

		return deleteRoot(root);

		Node* node;

		if(isLeaf(P.first))

		node=deleteLeaf(P.first, P.second);

		else if(hasSingleChild(P.first))

		node=deleteSingleChildNode(P.first, P.second);

		else

		node=deleteDoubleChildNode(P.first, P.second);

		delete(node);

		return root;

		}
	
	static void delNode(Node root, int k) {
		
	}
	public static void main(String args[]) {
		NodeD root = new NodeD(10);
        root.left = new NodeD(5);
        root.right = new NodeD(15);
        root.right.left = new NodeD(12);
        root.right.right = new NodeD(18);

        int x = 15;
        root = delNode(root, x);
	}
}
