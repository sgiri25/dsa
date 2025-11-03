package pp.recursion;

public class DisplayNumbers {
	public static void main(String args[]) {
		int n = 4;
		int y = 1;
		display(n, y);
	}
	
	public static void display(int x, int z) {
		if(z > x) {
			return;
		}
		System.out.println(z);
		
		display(x, z+1);
	}
}
