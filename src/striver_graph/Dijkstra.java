package striver_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
	static class Edge {
		int dest, weight;
		Edge(int dest, int weight){
			this.dest = dest;
			this.weight = weight;
		}
	}
	static void dijkstra(List<List<Edge>> graph, int start) {
		int V = graph.size();
		int[] dist = new int[V];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		
		// Priority queue and min heap
		PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p[0]));
		pq.offer(new int[] {0, start});
		
		while(!pq.isEmpty()) {
			int [] current = pq.poll();
			int currentDist = current[0];
			int u = current[1];
			
			if(currentDist > dist[u]) continue;
			// Explore neighbors
			for(Edge edge : graph.get(u)) {
				int weight = edge.weight;
				int v = edge.dest;			
				
				if(dist[u] + weight < dist[v]) {
					dist[v] = dist[u] + weight;
					pq.offer(new int[] {dist[v], v});
				}
				
			}

			
		}
		 // Print shortest distances from source
        System.out.println("Shortest distances from node " + start + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("To node " + i + " = " + dist[i]);
        }
	}
//	static int[] dijkstra(int V,  ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
//		PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y) -> x.distance - y.distance);
//		
//		int[] dist = new int[V];
//		for(int i = 0; i < V; i++ ) {
//			dist[i] = (int)1e9;
//			
//		}
//		
//		dist[S] = 0;
//		pq.add(new Pair(0, S));
//		
//		while(pq.size() != 0) {
//			int dis = pq.peek().distance;
//			int node = pq.peek().node;
//			pq.remove();
//			
//			for(int i = 0; i < adj.get(node).size(); i++) {
//				int edgeWeight = adj.get(node).get(i).get(1);
//				int adjNode = adj.get(node).get(i).get(0);
//				
//				if(dis + edgeWeight < dis[adjNode]) {
//					dis[adjNode] = dis + edgeWeight;
//					pq.add(new Pair(dis[adjNode], adjNode));
//				}
//			}
//		}
//	}
	public static void main(String[] args) {
		int V = 5;
		List<List<Edge>> graph = new ArrayList<>();
		for(int i = 0; i < V; i++) {
			graph.add(new ArrayList<>());
		}
		
		// Add edges (undirected graph for example)
        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(4, 5));
        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(4, 2));
        graph.get(2).add(new Edge(3, 4));
        graph.get(3).add(new Edge(0, 7));
        graph.get(3).add(new Edge(2, 6));
        graph.get(4).add(new Edge(1, 3));
        graph.get(4).add(new Edge(2, 9));
        graph.get(4).add(new Edge(3, 2));
        
     // Run Dijkstra from source node 0
        dijkstra(graph, 0);
	}
}
