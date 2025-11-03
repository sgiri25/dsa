package controlflow;

public class Flow {
	public static void main(String args[]) {
//		int a = 10;
//		if(a > 8) {
//			System.out.println("Value greater than 8");
//		}
		
		int a = 1;
		int b = 4;
		
		switch(a+b) {
			case 1:
				System.out.println("a+b is 1");
				break;
			default:
				System.out.println("a+b is-->"+ a+b);
			case 2:
				System.out.println("a+b is 2");
				break;
			case 3:
				System.out.println("a+b is 3");
				
			
		}
				
	}
}
