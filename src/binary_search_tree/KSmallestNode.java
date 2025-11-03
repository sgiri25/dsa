package binary_search_tree;

class NodeK {
    int data;
    NodeK left, right;

    NodeK(int x) {
        data = x;
        left = null;
        right = null;
    }
}
public class KSmallestNode {
	static int kthSmallest(NodeK root, int k) {
		int cnt = 1;
		int ans = 0;
		return traverse(root, k, cnt, ans);
		//return ans;
	}
	static int traverse(NodeK root, int k, int cnt, int ans) {
		if(root == null) {
			return -1;
		}
		
		int left = traverse(root.left, k, cnt, ans);
		System.out.println("LEFT-->"+root.data+"<-->"+left+"<-->"+cnt);
		if(left != -1) {
			return left;
		}
		cnt++;
		if(cnt == k) {
			ans = root.data;
			return ans;
		}
		int right = traverse(root.right, k, cnt, ans);
		System.out.println("RIGHT-->"+root.data+"<-->"+right+"<-->"+cnt);
		return right;
	}
	public static void main(String args[]) {
		NodeK root = new NodeK(20);
        root.left = new NodeK(8);
        root.right = new NodeK(22);
        root.left.left = new NodeK(4);
        root.left.right = new NodeK(12);
        root.left.right.left = new NodeK(10);
        root.left.right.right = new NodeK(14);
        int k = 4;

        System.out.println(kthSmallest(root, k));
	}
}
