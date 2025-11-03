package pp.recursion;

public class DistinctPath {
	public static void main(String args[]) {
		int row = 9;
		int col = 51;
		int ans = 0;
		ans = distinctPath(0, 0, row, col);
		System.out.println(ans);
	}
	
	public static int distinctPath(int i, int j, int m, int n) {
	
		if(i == m - 1 || j == n - 1) {
			
			return 1;
		}
		
		return distinctPath(i+1, j, m, n) + distinctPath(i, j+1, m, n);
//		if(i != m -1) {
//			distinctPath(i+1, j, m, n, ans);
//		}else if(i == m - 1) {
//			ans += 1;
//			distinctPath(i, j+1, m, n, ans);
//			
//			System.out.println(ans);
//		}
//		
//		if(j != n -1) {
//			distinctPath(i, j+1, m, n, ans);
//		}else if(j == n - 1) {
//			ans += 1;
//			distinctPath(i+1, j, m, n, ans);
//			
//			System.out.println(ans);
//		}
//		
//		//System.out.println(ans);
//		
//		return  ans;
		
		
	}
}
