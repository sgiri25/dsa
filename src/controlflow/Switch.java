package controlflow;

enum Day{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}

public class Switch {
	public static void main(String args[]) {
		Day dayEnumVal = Day.MONDAY;
		
		int outputValue = 0;
		switch(dayEnumVal) {
			case MONDAY:
				outputValue = 1;
				switch(outputValue) {
					case 1:
						break;
					case 2:
						break;
					default:
						System.out.println("");
				}
				break;
			case TUESDAY:
				outputValue = 2;
				break;				
		}
	}
}
