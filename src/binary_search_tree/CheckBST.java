package binary_search_tree;

class CheckNodeBST {
    int data;
    CheckNodeBST left, right;

    CheckNodeBST(int value) {
        data = value;
        left = right = null;
    }
}
public class CheckBST1 {
	static void traverse(CheckNodeBST root, int prev, boolean ans){
		if(root == null) {
			return;
		}
		traverse(root.left, prev, ans);
		if(prev < root.data) {
			prev = root.data;
		}else {
			ans = false;
			return;
		}
		traverse(root.right, prev, ans);
	}
	static boolean checkBST1(CheckNodeBST root) {
		int prev = Integer.MIN_VALUE;
		boolean ans = true;
		traverse(root, prev, ans);
		return ans;
		
	}
	public static void main(String args) {
		CheckNodeBST root = new CheckNodeBST(10);
        root.left = new CheckNodeBST(5);
        root.right = new CheckNodeBST(20);
        root.right.left = new CheckNodeBST(9);
        root.right.right = new CheckNodeBST(25);
        
        checkBST1(root);
	}
}
