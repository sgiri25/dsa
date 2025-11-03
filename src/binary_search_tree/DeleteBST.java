package binary_search_tree;

import java.util.ArrayList;

class NodeBST {
    int key;
    NodeBST left, right;

    public NodeBST(int item) {
        key = item;
        left = right = null;
    }
}
public class DeleteBST {
	static boolean isLeafNode(NodeBST root, int k) {
		NodeBST temp = root;
		if(temp.left == null && temp.right == null) {
			return true;
		}
		return false;
	}
	static boolean isPresent(NodeBST root, int k) {
		System.out.println(root.key);
		System.out.println(k);
		if(root.key == k) {
			return true;
		}
		return false;
	}
	static NodeBST delLeafNode(NodeBST root, int item) {
		NodeBST temp = root;
		NodeBST par = null;
		while(temp != null) {
			if(temp.key > item) {
				par = temp;
				temp = temp.left;
				
				if(isPresent(temp, item)) {
					if(isLeafNode(temp, item)) {
						System.out.println(par.key+" PARENT LEFT"+ temp.key);
						par.left = null;
						temp = null;
						//System.out.println(par.key+" PARENT LEFT"+ temp.key);
						//par.right = null;
					}else {
						System.out.println(temp.key+" is not a leaf node");
					}
				}else {
					System.out.println("Item is not found");
				}
			}else if(temp.key < item) {
				par = temp;
				temp = temp.right;
				
				if(isPresent(temp, item)) {
					if(isLeafNode(temp, item)) {
						//par.left = null;
						System.out.println(par.key+" PARENT");
						par.right = null;
					}else {
						System.out.println(temp.key+" is not a leaf node");
					}
				}else {
					System.out.println("Item is not found");
				}
			}
		}
		System.out.println(root);
		return root;
	}
	static boolean isSingleChildNode(NodeBST root, int k) {
		if((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
			return true;
		}
		return false;
	}
	static boolean isDoubleChildNode(NodeBST root, int k) {
		if((root.left != null && root.right != null)) {
			return true;
		}
		return false;
	}
	static NodeBST delSingleChildNode(NodeBST root, int item) {
		NodeBST temp = root;
		NodeBST par = null;
		while(temp != null) {
			if(temp.key > item) {
				par = temp;
				temp = temp.left;
				
				if(isPresent(temp, item)) {
					if(isSingleChildNode(temp, item)) {
						if(temp.left == null) {
							par.left = temp.right;
							temp = null;
						}else {
							par.left = temp.left;
							temp = null;
						}
					}else {
						System.out.println(temp.key+" is not a leaf node");
					}
				}else {
					System.out.println("Item is not found");
				}
			}else if(temp.key < item) {
				par = temp;
				temp = temp.right;
				
				if(isPresent(temp, item)) {
					if(isLeafNode(temp, item)) {
						if(temp.left == null) {
							par.right = temp.right;
							temp = null;
						}else {
							par.right = temp.left;
							temp = null;
						}
					}else {
						System.out.println(temp.key+" is not a leaf node");
					}
				}else {
					System.out.println("Item is not found");
				}
			}
		}
		System.out.println(root);
		return root;
	}
	static ArrayList<NodeBST> findPreSuc(NodeBST root, int key) {
		NodeBST pre = null, suc = null;

		NodeBST current = root;
        while (current != null) {
            if (current.key < key) {
                pre = current;
                current = current.right;
            } else if (current.key > key) {
                suc = current;
                current = current.left;
            } else {
                // Key found
                if (current.left != null) {
                	NodeBST temp = current.left;
                    while (temp.right != null)
                        temp = temp.right;
                    pre = temp;
                }

                if (current.right != null) {
                	NodeBST temp = current.right;
                    while (temp.left != null)
                        temp = temp.left;
                    suc = temp;
                }
                break;
            }
        }

        ArrayList<NodeBST> result = new ArrayList<>();
        // index 0 = predecessor
        result.add(pre);
        // index 1 = successor
        result.add(suc);
        return result;
    }

	static NodeBST delDoubleChildNode(NodeBST root, int item) {
		NodeBST temp = root;
		NodeBST par = null;
		
		ArrayList<NodeBST> result = findPreSuc(root, item);
		NodeBST pre = result.get(0);
		NodeBST suc = result.get(1);
		
		System.out.println("Pre-->"+pre.key);
		System.out.println("Suc-->"+suc.key);
		
		return pre;
        
//		while(temp != null) {
//			if(temp.key > item) {
//				par = temp;
//				temp = temp.left;
//				NodeBST n1 = null;
//				if(isPresent(temp, item)) {
//					if(isLeafNode(pre, item)) {
//						n1 = delLeafNode(pre, item);
//					}
//					if(isDoubleChildNode(temp, item)) {
//						if(temp.left == null) {
//							par.left = temp.right;
//							temp = null;
//						}else {
//							par.left = temp.left;
//							temp = null;
//						}
//					}else {
//						System.out.println(temp.key+" is not a leaf node");
//					}
//				}else {
//					System.out.println("Item is not found");
//				}
//			}else if(temp.key < item) {
//				par = temp;
//				temp = temp.right;
//				
//				if(isPresent(temp, item)) {
//					if(isDoubleChildNode(temp, item)) {
//						if(temp.left == null) {
//							par.right = temp.right;
//							temp = null;
//						}else {
//							par.right = temp.left;
//							temp = null;
//						}
//					}else {
//						System.out.println(temp.key+" is not a leaf node");
//					}
//				}else {
//					System.out.println("Item is not found");
//				}
//			}
//		}
//		System.out.println(root);
//		return root;
		
	}
	static void inorder(NodeBST root) {
		
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
	public static void main(String args[]) {
		NodeBST root = new NodeBST(10);
        root.left = new NodeBST(5);
        root.left.left = new NodeBST(4);
        root.left.right = new NodeBST(8);
        root.left.right.left = new NodeBST(7);
        root.left.right.right = new NodeBST(9);
        root.right = new NodeBST(15);
        root.right.left = new NodeBST(12);
        root.right.left.left = new NodeBST(11);
        root.right.left.right = new NodeBST(14);
        root.right.right = new NodeBST(18);
        int k = 5;
        //root = delLeafNode(root, k);
        //System.out.println(root);
        //root = delSingleChildNode(root, k);
        root = delDoubleChildNode(root, k);
        inorder(root);

	}
}
