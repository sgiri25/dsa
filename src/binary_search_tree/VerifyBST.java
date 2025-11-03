package binary_search_tree;

class CheckNodeBST1 {
    int data;
    CheckNodeBST1 left, right;

    CheckNodeBST1(int value) {
        data = value;
        left = right = null;
    }
}
public class VerifyBST {
	boolean ans = true;
	static void traverse(CheckNodeBST1 root, int prev, VerifyBST vb){
		if(root == null) {
			return;
		}
		traverse(root.left, prev, vb);
		if(prev < root.data) {
			prev = root.data;
		}else {
			vb.ans = false;
			//System.out.println(ans);
			return;
		}
		traverse(root.right, prev, vb);
	}
	static boolean checkBST1(CheckNodeBST1 root, VerifyBST vb ) {
		int prev = Integer.MIN_VALUE;
		//Boolean ans = true;
		traverse(root, prev, vb);
		//System.out.println(ans);
		return vb.ans;
		
	}
	public static void main(String[] args) {
		CheckNodeBST1 root = new CheckNodeBST1(10);
		VerifyBST vb = new VerifyBST();
        root.left = new CheckNodeBST1(5);
        root.right = new CheckNodeBST1(20);
        root.right.left = new CheckNodeBST1(11);
        root.right.right = new CheckNodeBST1(25);
        
        System.out.println(checkBST1(root, vb));
	}
}
