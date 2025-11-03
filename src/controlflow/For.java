package controlflow;

public class For {
	public static void main(String args[]) {
		for(int val = 1; val < 10; val++) {
			System.out.println(val);
		}
		
		for(int x = 1; x <= 3; x++) {
			for(int y = 1; y <= 3; y++) {
				System.out.println("X-->"+x+" Y-->"+y);
			}
		}
	}
}
