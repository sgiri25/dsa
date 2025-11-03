package binary_search_tree;

//Java program to find kth 
//smallest value in BST

class NodeKth {
 int data;
 NodeKth left, right;

 NodeKth(int x) {
     data = x;
     left = null;
     right = null;
 }
}

class KthSmallestNode {

 // Recursive function for inorder traversal of the tree 
	// and find its kth smallest value.
 // Returns -1 if value is not found.
 static int kthSmallestRecur(NodeKth root, int[] cnt, int k) {
     if (root == null) return -1;
     
     // Process left subtree.
     int left = kthSmallestRecur(root.left, cnt, k);
     System.out.println("LEFT-->"+root.data+"<-->"+left+"<-->"+cnt[0]);
     System.out.println("----------------------------");
     // If kth smallest is found in left 
     // subtree, then return it.
     if (left != -1) return left;
     
     // increment node count
     cnt[0]++;
     
     // If curr node is kth smallest,
     // return it.
     if (cnt[0] == k) {
    	 System.out.println("SG-->"+root.data+"--"+cnt[0]);
    	 return root.data;
     }
     
     
     // Else process the right subtree
     // and return its value.
     System.out.println("RIGHT BEFORE-->"+root.right+"<-->"+cnt[0]);
     int right = kthSmallestRecur(root.right, cnt, k);
     System.out.println("RIGHT-->"+root.data+"<-->"+right+"<-->"+cnt[0]);
     System.out.println("----------------------------");
     return right;
 }

 // Function to find kth smallest value in BST.
 static int kthSmallest(NodeKth root, int k) {
     int[] cnt = {0};
     return kthSmallestRecur(root, cnt, k);
 }

 public static void main(String[] args) {

     // Binary search tree
     //      20
     //    /   \
     //   8     22
     //  / \
     // 4   12
     //    /  \
     //   10   14
	 NodeKth root = new NodeKth(20);
     root.left = new NodeKth(8);
     root.right = new NodeKth(22);
     root.left.left = new NodeKth(4);
     root.left.right = new NodeKth(12);
     root.left.right.left = new NodeKth(10);
     root.left.right.right = new NodeKth(14);
     int k = 1;

     System.out.println(kthSmallest(root, k));
 }
}

