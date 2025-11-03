package striver_graph;

public class NoOfIslandsDFS {
	static void addEdge(int[][] adj, int u, int v) {
		adj[u][v] = 1;
	}
	static void printMatrix(int[][] adj, int row, int col) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 5;
		int m = 4;
		
		int[][] adj = new int[n][m]; 
		
		addEdge(adj, 0,1);
		addEdge(adj, 0,2);
		addEdge(adj, 1,1);
		addEdge(adj, 1,2);
		addEdge(adj, 2,2);
		addEdge(adj, 4,0);
		addEdge(adj, 4,1);
		addEdge(adj, 4,3);
		
		printMatrix(adj, n, m);
		
		//System.out.println(numIslands(adj, n, m));
	}
}
