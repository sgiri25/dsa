package striver_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlienDict {
	static List<Integer> topoSort(int x, ArrayList<ArrayList<Integer>> adj) {
		int[] degree = new int[x];
		for(int i = 0; i < x; i++) {
			for(int it : adj.get(i)) {
				degree[it]++;
			}
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i =0; i < x; i++) {
			if(degree[i] == 0) {
				q.add(i);
			}
		}
		
		List<Integer> topo = new ArrayList<>();
		while(!q.isEmpty()) {
			int node = q.poll();
			topo.add(node);
			
			for(int it: adj.get(node)) {
				degree[it]--;
				if(degree[it] == 0) q.add(it);
			}
		}
		return topo;
	}
	static void makeDAG(String s1, String s2, ArrayList<ArrayList<Integer>> adj) {
		
		int len = Math.min(s1.length(), s2.length());
		for(int i = 0; i < len; i++) {
			if(s1.charAt(i) - 'a' != s2.charAt(i) - 'a') {
				adj.get(s1.charAt(i) - 'a').add(s2.charAt(i) - 'a');
				break;
			}
		}
		
		
	}
	static String getAlienOrder(String[] dict, int str, int y) {
		String ans = "";
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i = 0; i < 4; i++) {
			adj.add(new ArrayList<>());
		}
		for(int i = 0; i < str - 1; i++) {
			makeDAG(dict[i], dict[i+1], adj);
		}
		
		for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
		
		List<Integer> res = topoSort(4, adj);
		
		for(int it : res) {
			ans = ans + (char)(it + (int)('a'));
			//System.out.println(ans);
		}
		
		
		return ans;
		
	}
	public static void main(String[] args) {
		int N = 5;
		int K = 4;
		String[] dict = {"baa", "abcd", "abca", "cab", "cad"}; 
		
		
		String order = getAlienOrder(dict, N, K);
		System.out.print(order);
	}
}
