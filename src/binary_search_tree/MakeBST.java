package binary_search_tree;

class NodeFromArray {
    int data;
    NodeFromArray left, right;

    NodeFromArray(int value) {
        data = value;
        left = right = null;
    }
}
public class MakeBST {
	static NodeFromArray makeTree(int[] arr, int i, int j) {
		if(i > j) return null;
		int m = (i+j) / 2;
		//System.out.println(m);
		NodeFromArray root = new NodeFromArray(arr[m]);
		root.left = makeTree(arr, i, m - 1);
		root.right = makeTree(arr, m+1, j);
		return root;
	}
	static void preOrder(NodeFromArray root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int start = 0;
		int end = arr.length-1;
		NodeFromArray root = makeTree(arr, start, end);
		preOrder(root);
	}
}
