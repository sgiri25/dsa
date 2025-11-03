package binary_search_tree;

class CheckNodeBST4 {
    int data;
    CheckNodeBST4 left, right;

    CheckNodeBST4(int value) {
        data = value;
        left = right = null;
    }
}
public class CheckBST4 {
	boolean ans = true;
	static void check(CheckNodeBST4 root, long lb, long ub, CheckBST4 vb ) {
		if(root == null) {
			return;
		}
		if(root.data <= lb || root.data >= ub) {
			vb.ans = false;
			return;
		}
		
		check(root.left, lb, root.data, vb);
		check(root.right, root.data, ub, vb);
		
	}
	public static void main(String[] args) {
		CheckNodeBST4 root = new CheckNodeBST4(10);
		CheckBST4 vb = new CheckBST4();
        root.left = new CheckNodeBST4(5);
        root.right = new CheckNodeBST4(20);
        root.right.left = new CheckNodeBST4(7);
        root.right.right = new CheckNodeBST4(25);
        
        Long lb = Long.MIN_VALUE;
        Long ub = Long.MAX_VALUE;
        
        vb.check(root, lb, ub, vb);
        System.out.println(vb.ans);
	}
}
