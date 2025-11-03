package pp;

public class histogram {
	public static void main(String args[]) {
		int[] arr = {0,1,0,2,1,3,0,2};
		int n = arr.length;
		int h1;
		int h2;
		int ans = 0;
		int decided_h;
		
		int[] p_max = new int[n];
		int[] s_max = new int[n];
		
		p_max[0] = arr[0];
		for (int i=1; i < n; i++) {
			p_max[i] = max(p_max[i-1], arr[i]);
		}
		
		s_max[n-1] = arr[n-1];
		for (int i=n-2; i >= 0; i--) {
			s_max[i] = max(s_max[i+1], arr[i]);
		}
		
		for(int i = 1; i < n-1; i++) {
			h1 = p_max[i-1];
			//System.out.println(h1);
			h2 = s_max[i+1];
			//System.out.println(h2);
			
			decided_h = min(h1, h2);
			System.out.println(arr[i]+"----"+decided_h);
			if(decided_h > arr[i]) {
				ans += decided_h - arr[i]; 
			}
			System.out.println(ans);
			System.out.println("-------------------");
			
		}
		
		System.out.println(ans);
	}
	
	public static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
