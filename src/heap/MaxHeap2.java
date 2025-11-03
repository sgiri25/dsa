package heap;

import java.util.ArrayList;

public class MaxHeap2 {
	static ArrayList<Integer> heap;
	
	public MaxHeap2() {
		heap = new ArrayList<Integer>();
	}
	
	static void swap(int i, int j) {
		int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
	}
	
	static int parent(int a) {
		return (a - 1) / 2;
	}
	
	static void getMaxHeap(int ind, ArrayList<Integer> heap) {
		while(ind > 0 && heap.get(ind) > heap.get(parent(ind))) {
			swap(parent(ind), ind);
			ind = parent(ind);
		}
	}
	
	static void displayHeap(MaxHeap2 mh) {
		for(int it = 0; it < mh.heap.size() ; it++) {
			System.out.print(mh.heap.get(it) + " ");
		}
	}
	public static void main(String[] args) {
		MaxHeap2 mh = new MaxHeap2();
		// Insert values into the max heap
        mh.heap.add(20);
        mh.heap.add(1);
        mh.heap.add(4);
        mh.heap.add(30);
        mh.heap.add(16);
        mh.heap.add(9);
        mh.heap.add(7);
        mh.heap.add(15);
        mh.heap.add(41);
        mh.heap.add(5);
        mh.heap.add(11);
        mh.heap.add(3);
        mh.heap.add(29);
        mh.heap.add(25);
        mh.heap.add(40);
      
        for(int i = 1; i < mh.heap.size(); i++) {
        	getMaxHeap(i, mh.heap);
        }
        //displayHeap(mh);
        //int largest = mh.heap.get(0);
        //mh.getMaxHeap(mh, 0);
        displayHeap(mh);
	}
}
