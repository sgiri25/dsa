package controlflow;

public class While {
	public static void main(String args[]) {
		int val = 1;
		while(val <= 5) {
			System.out.println(val);
			val++;
		}
		
		do {
			System.out.println(val);
			val++;
		}while(val <= 5);
		
		int valArray[] = {1,2,3,4,5};
		for(int vall : valArray ) {
			System.out.print(vall);
		}
	}
}
