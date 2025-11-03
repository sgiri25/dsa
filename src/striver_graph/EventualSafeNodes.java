package striver_graph;

import java.util.ArrayList;

public class EventualSafeNodes {
	static boolean dfs(int node, ArrayList<ArrayList<Integer> > al, boolean[] vis, boolean[] cp_vis) {
		vis[node] = true;
		cp_vis[node] = true;
		
		for(int it : al.get(node)) {
			if(!vis[it]) {
				if(dfs(it, al, vis, cp_vis) == true) {
					return true;
				}
			}else if(cp_vis[it]) {
				return true;
			}
		}
		cp_vis[node] = false;
		return false;
	}
	static ArrayList<Integer> eventualSafeNodes(int V, ArrayList<ArrayList<Integer> > al) {
		boolean[] vis = new boolean[V];
		boolean[] cp_vis = new boolean[V];
		
		for(int i = 0; i < V; i++) {
			if(!vis[i]) {
				dfs(i, al, vis, cp_vis);
			}
			
		}
		
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0; i < V; i++) {
			if(vis[i] == true && cp_vis[i] == false) {
				res.add(i);
			}
		}
		
		return res;
		
	}
	public static void main(String[] args) {
		int v = 6;
        ArrayList<ArrayList<Integer> > al = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            al.add(new ArrayList<Integer>());
        }
        al.get(5).add(0);
        al.get(5).add(2);
        al.get(4).add(0);
        al.get(2).add(3);
        al.get(3).add(1);
        al.get(4).add(1);

        // Function call
        ArrayList<Integer> res = eventualSafeNodes(v, al);
        System.out.println(res);
	}
}
