package practice;

public class Employee {
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.memberVar = 10;
		modify(s1);
		System.out.print(s1.memberVar);
	}
	
	private static void modify(Student employee) {
		employee.memberVar= 20;
	}
}
