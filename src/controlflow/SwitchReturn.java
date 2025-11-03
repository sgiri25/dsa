package controlflow;

public class SwitchReturn {
	public static void main(String args[]) {
		int val = 1;
		String outputVal = switch(val) {
			case 1 -> "One";
			case 2 -> "Two";
			default -> "None";
			
		};
		System.out.println(outputVal);
		
		String outputVal1 = switch(val) {
		case 1 -> {
			yield "One";
		}
		case 2 -> {
			yield "Two";
		}
		default -> {
			yield "Default";
		}
		};
		System.out.println(outputVal1);
		
	}
}
