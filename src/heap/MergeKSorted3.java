package heap;

import java.util.ArrayList;
import java.util.List;

public class MergeKSorted3 {
	
	static ArrayList<Integer> mergeArrays(List<Integer> l, List<Integer> r){	
		System.out.println("l-->"+l);
		System.out.println("r-->"+r);
		ArrayList<Integer> result = new ArrayList<>();
		int x = 0, y = 0;
		
		while(x < l.size() && y < r.size()) {
			if(l.get(x) < r.get(y)) {
				result.add(l.get(x++));
			}else {
				result.add(r.get(y++));
			}
		}
		
		while(x < l.size()) result.add(l.get(x++));
		while(y < r.size()) result.add(r.get(y++));
		System.out.println(result);
		return result;
	}
	
	static ArrayList<Integer> mergeK(List<List<Integer>> lists, int x, int y) {
		if(x == y) return new ArrayList<>(lists.get(x));
		int mid = (x + y) / 2;
		
		ArrayList<Integer> left = mergeK(lists, x, mid);
		ArrayList<Integer> right = mergeK(lists, mid+1, y);
		
		return mergeArrays(left, right);
	}
	
	static ArrayList<Integer> mergeKArrays(int[][] arr, int k){
		if (k == 0) return new ArrayList<>();
		
		List<List<Integer>> lists = new ArrayList<>();
		for(int[] item : arr ) {
			List<Integer> temp = new ArrayList<>();
			for(int num : item) {
				temp.add(num);
				
			}
			lists.add(temp);
		}
		return mergeK(lists, 0, k - 1);
	}
	public static void main(String[] args) {
		int[][] arr = {
	            {1, 3, 5, 7},
	            {2, 4, 6, 8},
	            {0, 9, 10, 11}
	        };

        int k  = 3; 
        
        ArrayList<Integer> output = mergeKArrays(arr, k);
        //mergeKArrays(arr, k);

        for (int num : output) {
            System.out.print(num + " ");
        }
	}
}
