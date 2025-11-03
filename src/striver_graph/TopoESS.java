package striver_graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopoESS {
	static List<Integer> eventualSafeNodes(int V, List<List<Integer>> al) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		
		int indegree[] = new int[V];
		
		for(int i = 0; i < V; i++) {
			for(int it : al.get(i)) {
				adj.get(it).add(i);
				indegree[i]++;
			}
		}
		
		List<Integer> res = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < V; i++) {
			if(indegree[i] == 0) {
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int node = q.peek();
            q.remove();
			res.add(node);
			for(int it : adj.get(node)) {
				indegree[it]--;
				if(indegree[it] == 0) {
					q.add(it);
				}
			}
		}
		Collections.sort(res);
		return res;
	}
	public static void main(String[] args) {
		int V = 6;
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            al.add(new ArrayList<>());
        }
        al.get(5).add(0);
        al.get(5).add(2);
        al.get(4).add(0);
        al.get(2).add(3);
        al.get(3).add(1);
        al.get(4).add(1);
      
        List<Integer> res = eventualSafeNodes(V,al);
        for (int i=0;i<res.size();i++) {
            System.out.print(res.get(i) + " ");
        }
        System.out.println("");
	}
}
