package striver_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import striver_graph.Dijkstra.Edge;

public class PrintShortestPath {
	static class Pair {
		int node;
		int weight;
		
		Pair(int node, int weight){
			this.node = node;
			this.weight = weight;
		}
	}
	
	static void addEdge(ArrayList<ArrayList<Pair>> adj, int source, int dest, int weight) {
		adj.get(source).add(new Pair(dest, weight));
		adj.get(dest).add(new Pair(source, weight));
	}
	
	static void shortestPath(int V, ArrayList<ArrayList<Pair>> adj, int source, int dest) {
		int[] dist = new int[V];
		int[] parent = new int[V];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[source] = 0;
		
		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
		pq.add(new Pair(source, 0));
		
		
		for(int i = 0; i < V; i++) { 
			parent[i] = i;
		}
		
		while(!pq.isEmpty()) {
			Pair current = pq.poll();
			int currentDist = current.weight;
			int u = current.node;
			
			//if(currentDist > dist[u]) continue;
			// Explore neighbors
			for(Pair edge : adj.get(u)) {
				int weight = edge.weight;
				int v = edge.node;			
				
				if(dist[u] + weight < dist[v]) {
					dist[v] = dist[u] + weight;
					pq.offer(new Pair(v, dist[v]));
					parent[v] = u;
				}
				
			}
			
		}
		// Print shortest distance
        System.out.println("Shortest distance from " + source + " to " + dest + " = " + dist[dest]);

		// reconstruct shortest path
		List<Integer> path = new ArrayList<>();
		for(int i = 0; i < parent.length; i++) {
			System.out.print(parent[i] + " ");
		}
		int node = dest;
		System.out.println("Node->"+parent[node]);
		while(parent[node] != node) {
			path.add(node);
			node = parent[node];
			System.out.println("Node Inner->"+node);
		}
		path.add(source);
		
		Collections.reverse(path);

        System.out.println("Shortest Path: " + path);
	}
	static void printEdges(ArrayList<ArrayList<Pair>> adj, int V) {
		for(int i = 0; i < V; i++) { 
			System.out.print(i + " -> ");
			for(Pair edge : adj.get(i) ) {
				System.out.print(edge.node + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int V = 6;
		int src = 0;
		int dest = 5;
		
		ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
		for(int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		
		addEdge(adj, 0, 1, 4);
        addEdge(adj, 0, 2, 2);
        addEdge(adj, 1, 2, 1);
        addEdge(adj, 1, 3, 5);
        addEdge(adj, 2, 3, 8);
        addEdge(adj, 2, 4, 10);
        addEdge(adj, 3, 4, 2);
        addEdge(adj, 3, 5, 6);
        addEdge(adj, 4, 5, 3);
		
		//printEdges(adj, V);
		
		shortestPath(V, adj, src, dest);
		
	}
}
