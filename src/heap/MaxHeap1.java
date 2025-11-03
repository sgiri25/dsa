package heap;

import java.util.ArrayList;

public class MaxHeap1 {
	private ArrayList<Integer> heap;
	
	public MaxHeap1() {
		heap = new ArrayList<Integer>();
	}
	static int parent(int a) {
		return (a - 1) / 2;
	}
	private void swap(int i, int j) {
		int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
	}
	void insert(int a) {
		heap.add(a);
		int curr_index = heap.size() - 1;
//		while(curr_index > 0 && heap.get(curr_index) > heap.get(parent(curr_index))) {
//			swap(curr_index, parent(curr_index));
//			curr_index = parent(curr_index);
//		}
	}
	static int leftChild(MaxHeap1 mh, int i) {
		if(2 *i + 1 < mh.heap.size() ) {
			return mh.heap.get(2 * i + 1);
		}
		return -1;
		
	}
	static int rightChild(MaxHeap1 mh, int i) {
		if(2 *i + 2 < mh.heap.size() ) {
			return mh.heap.get(2 * i + 2);
		}
		return -1;
	}
	private  void getMaxHeap(MaxHeap1 mh, int i){
		int n = 5;
		//System.out.print(i + " ");
//		if (i >= (n / 2) && i <= n)
//            return;
//		while(i < n) {
			int left = leftChild(mh, i);
			int right = rightChild(mh, i);
			int left_i = 2 * i + 1;
			int right_i = 2 * i + 2;
			int largest_i = i;
			int largest = mh.heap.get(i);
			
			if(left > largest) {
				//largest = left;				
				while(left_i > 0 && heap.get(left_i) > heap.get(parent(left_i))) {
					//System.out.println(parent(left_i) +"---"+ left_i);
					swap(parent(left_i), left_i);
					left_i = parent(left_i);
				}	
				
			}
			if(left_i < n) {
				getMaxHeap(mh, left_i);
			}
			
			if(right > largest) {
				//largest = right;
				while(right_i > 0 && heap.get(right_i) > heap.get(parent(right_i))) {
					swap(parent(right_i), right_i);
					right_i = parent(right_i);
					//System.out.println(right_i);
				}

			}
			if(right_i < n) {
				getMaxHeap(mh, right_i);
			}
		
		//return mh.heap.get(0);
		
		
		
	}
	static void displayHeap(MaxHeap1 mh) {
		for(int it = 0; it < mh.heap.size() ; it++) {
			System.out.print(mh.heap.get(it) + " ");
		}
	}
	public static void main(String[] args) {
		MaxHeap1 mh = new MaxHeap1();
		// Insert values into the max heap
        mh.insert(10);
        mh.insert(5);
        mh.insert(15);
        mh.insert(20);
        mh.insert(25);
        
        //displayHeap(mh);
        int largest = mh.heap.get(0);
        mh.getMaxHeap(mh, 0);
        displayHeap(mh);
	}
}
