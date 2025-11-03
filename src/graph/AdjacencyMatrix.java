package graph;

public class AdjacencyMatrix {
	
	public static void addEdge(int[][] mat, int i, int j) {
		mat[i][j] = 1;
		mat[j][i] = 1;
				
	}
	
	public static void displayMatrix(int[][] mat) {
		//System.out.println(mat[0][0]);
		for(int[] row : mat) {
			for(int val : row) {
				System.out.print(val+ " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String args[]) {
		// Create a graph with 4 vertices and no edges
		// Note that all value are initialized as 0
		
		int V = 4;
		int[][] mat = new int[V][V];
		
		// now add edges one by one
		addEdge(mat, 0, 1);
		addEdge(mat, 0, 2);
        addEdge(mat, 1, 2);
        addEdge(mat, 2, 3);
        
        System.out.println("Adjacency matrix representation");
        displayMatrix(mat);
	}
}
