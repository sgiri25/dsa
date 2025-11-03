package striver_graph;

public class DijkstraSet {
	static void shortestPath(int V, int[][] edges, int src) {
		
	}
	public static void main(String[] args) {
		int V = 5;
		int src = 0;
		// edge list format: {u, v, weight}
        int[][] edges = {{0, 1, 4}, {0, 2, 8}, {1, 4, 6}, 
                           {2, 3, 2}, {3, 4, 10}}; 
        int[] result = shortestPath(V, edges, src);
	}
}
