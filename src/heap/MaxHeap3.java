package heap;

import java.util.ArrayList;

public class MaxHeap3 {
	static ArrayList<Integer> heap;
	
	public MaxHeap3() {
		heap = new ArrayList<Integer>();
	}
	
	static int leftChild(ArrayList<Integer> heap, int i) {
		if(2 *i + 1 < heap.size() ) {
			return heap.get(2 * i + 1);
		}
		return -1;
		
	}
	static int rightChild(ArrayList<Integer> heap, int i) {
		if(2 *i + 2 < heap.size() ) {
			return heap.get(2 * i + 2);
		}
		return -1;
	}
	
	static int parent(int a) {
		return (a - 1) / 2;
	}
	
	static void swap(int i, int j) {
		
		int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
		
		
	}
	
	static void maxHeapify(ArrayList<Integer> heap) {
		int n = heap.size();
		for(int i=n/2; i >= 0; i--) {
			int left = leftChild(heap, i);
			int left_i = 2 * i + 1;
			int right = rightChild(heap, i);
			int right_i = 2 * i + 2;
			int current = heap.get(i);
			if(left > current || right > current) {
				if(left > right) {
					while(left_i >= 0 && heap.get(left_i) > heap.get(parent(left_i))) {
						swap(parent(left_i), left_i);
						left_i = parent(left_i);
					}
					//swap(i, left_i);
				}else {
					while(right_i >= 0 && heap.get(right_i) > heap.get(parent(right_i))) {
						swap(parent(right_i), right_i);
						right_i = parent(right_i);
					}
				}
			}
			
			
		}
	}
	static void displayHeap(MaxHeap3 mh) {
		for(int it = 0; it < mh.heap.size() ; it++) {
			System.out.print(mh.heap.get(it) + " ");
		}
	}
	public static void main(String[] args) {
		MaxHeap3 mh = new MaxHeap3();
		mh.heap.add(1);
		mh.heap.add(70);
		mh.heap.add(65);
		mh.heap.add(44);
		mh.heap.add(22);
		mh.heap.add(10);
		mh.heap.add(3);
		
		maxHeapify(mh.heap);
		displayHeap(mh);
		
	}
}
