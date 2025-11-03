package binarytree;

import java.util.ArrayList;
import java.util.List;

class Node1 {
    Node1 left;
    Node1 right;
    int data;

    Node1(int x, Node1 l, Node1 r) {
        data = x;
        left = right = null;
    }
}
public class AllPossibleBinaryTree {
	
	public static ArrayList<Node1> countTree(int n) {
		//Node ans;
		
		if(n == 0) {
			ArrayList<Node1> ans = new ArrayList<>();
			ans.add(null);
			return ans;
		}
		ArrayList<Node1> ans = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			ArrayList<Node1> lsts = countTree(i);
			ArrayList<Node1> rsts = countTree(n-1-i);
			
			for(int j = 0;j < lsts.size(); j++) {
				for(int k = 0; k < rsts.size(); k++) {
					ans.add(new Node1(k, lsts.get(j), rsts.get(k)));
				}
			}
			
		}
		
		
		return ans;
	}
	public static void main(String args[]) {
		int n = 4;
		
		System.out.println(countTree(n).get(2).data);
	}
}
