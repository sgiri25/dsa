package binary_search_tree;

import java.util.ArrayList;
import java.util.List;

class CheckNodeBST3 {
    int data;
    CheckNodeBST3 left, right;

    CheckNodeBST3(int value) {
        data = value;
        left = right = null;
    }
}
public class CheckBST3 {
	
	class Pair<F, S, B> {

		  private F first; //first member of pair
		  private S second; //second member of pair
		  private B third;

		  public Pair(F first, S second, B third) {
		    this.first = first;
		    this.second = second;
		    this.third = third;
		  }

		  public F getFirst() {
		    return first;
		  }

		  public S getSecond() {
		    return second;
		  }
		  
		  public B getThird() {
			  return third;
		  }

		  @Override
		  public String toString() {
		    return "(" + this.first + ", " + this.second + ", " + this.third + ")";
		  }
		}
	
	Pair<Long, Long, Boolean> checkNode(CheckNodeBST3 root){		
		Long long_max = Long.MIN_VALUE;
		Long long_min = Long.MAX_VALUE;
		
		ArrayList<Pair<Long, Long, Boolean>> match = new ArrayList<Pair<Long, Long, Boolean>>();
		if(root == null) {
			//System.out.println(new Pair<Long, Long, Boolean>(long_max, long_min, true));
			return new Pair<Long, Long, Boolean>(long_max, long_min, true);
		}
		
		Pair<Long, Long, Boolean> left;
		Pair<Long, Long, Boolean> right;
		CheckNodeBST3 temp = root;
		
		left = checkNode(temp.left);
		right = checkNode(temp.right);
		boolean flag = false;
		//System.out.println(temp.data+ " > " + left.getFirst());
		//System.out.println(temp.data+ " > " + left.getSecond());
		flag = left.getThird() && right.getThird() && temp.data > left.getFirst() && temp.data < right.getSecond();
		System.out.println(flag);
		long minm = Math.min((long)root.data, Math.min(left.getSecond(), right.getSecond()));
		System.out.println(minm +"---"+ root.data);
		long maxm = Math.max((long)root.data, Math.max(left.getFirst(), right.getFirst()));
		System.out.println(maxm +"---"+ root.data);
		return new Pair<Long, Long, Boolean>(maxm, minm, flag);
				
	}
	public static void main(String[] args) {
		CheckNodeBST3 root = new CheckNodeBST3(10);
		CheckBST3 vb = new CheckBST3();
        root.left = new CheckNodeBST3(5);
        root.right = new CheckNodeBST3(20);
        root.right.left = new CheckNodeBST3(7);
        root.right.right = new CheckNodeBST3(25);
        
        System.out.println(vb.checkNode(root));
	}
}
