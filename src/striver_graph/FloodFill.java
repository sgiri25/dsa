package striver_graph;

public class FloodFill {
	private static void dfs(int[][] image, int sr, int sc, int node, int newColor) {
		int row = image.length;
		int col = image[0].length;
		if(sr < 0 || sr >= row || sc < 0 || sc >= col || image[sr][sc] != node) {
			return;
		}
		image[sr][sc] = 2;
		
		dfs(image, sr, sc - 1, node , newColor);
		dfs(image, sr, sc + 1, node , newColor);
		dfs(image, sr-1, sc, node , newColor);
		dfs(image, sr+1, sc, node , newColor);
	}
	static int[][] floodFill(int[][] image, int sr, int sc, int newColor){
		if(image[sr][sc] == 2) {
			return image;
		}
		dfs(image, sr, sc, image[sr][sc], newColor);
		return image;
	}
	public static void main(String[] args) {
		// Define an image matrix
		int[][] image = {
				{1,1,1,0},
				{0,1,1,1},
				{1,0,1,1}
		};
		// Starting pixel and the new color
        int sr = 1, sc = 2, newColor = 2;
        
     // Perform flood fill
        int[][] result = floodFill(image, sr, sc, newColor);
        for(int[] row : result) {
        	for(int pixel : row) {
        		System.out.print(pixel + " ");
        	}
        	System.out.println();
        }
	}
}
