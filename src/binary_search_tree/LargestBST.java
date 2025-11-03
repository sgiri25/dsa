package binary_search_tree;

class LargestNode {
    int data;
    boolean isBst = false;
    long minm;
    long maxm;
    long cntNodes;
    LargestNode left, right;

    LargestNode(int x, boolean flag, long minVal, long maxVal, long cnt) {
        data = x;
        left = null;
        right = null;
        
        isBst = flag;
        minm = minVal;
        maxm = maxVal;
        cntNodes = cnt;
    }
}
public class LargestBST {
	int ans = 0;
	static LargestNode largestBst(LargestNode root, LargestBST lb) {
		Long long_min = Long.MAX_VALUE;
        Long long_max = Long.MIN_VALUE;
        
        if(root == null) {
        	return new LargestNode(0, true, long_min, long_max, 0);
        }
        
        LargestNode lst = largestBst(root.left, lb);
        LargestNode rst = largestBst(root.right, lb);
        
        boolean isBst = false;
        long cnt = 1 + lst.cntNodes + rst.cntNodes;
        System.out.println(root.data+"--->"+cnt);
        
        long minm = Math.min(root.data, Math.min(lst.minm, rst.minm));
        //System.out.println(minm);
        long maxm = Math.max(root.data, Math.max(lst.maxm, rst.maxm));
        //System.out.println(maxm);
        
        if(lst.isBst && rst.isBst && root.data > lst.maxm && root.data < rst.minm) {
        	lb.ans = (int) Math.max(lb.ans, cnt);
        	System.out.println("Answer-->"+lb.ans);
        	isBst = true;
        }
        return new LargestNode(root.data, isBst, minm, maxm, cnt);
        
	}
	public static void main(String[] args) {
		Long long_min = Long.MAX_VALUE;
        Long long_max = Long.MIN_VALUE;
        
		LargestNode root = new LargestNode(5, true, long_min, long_max, 0);
		LargestBST lb = new LargestBST();
        root.left = new LargestNode(65, true, long_min, long_max, 0);
        root.right = new LargestNode(4, true, long_min, long_max, 0);
        root.right.left = new LargestNode(3, true, long_min, long_max, 0);
        root.left.left = new LargestNode(40, true, long_min, long_max, 0);
        largestBst(root, lb);
        //System.out.println(lb.ans);
	}
}
