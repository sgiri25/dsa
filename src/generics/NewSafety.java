package generics;

import java.util.ArrayList;

public class NewSafety {
	public static void main(String args[]) {
//		ArrayList  al = new ArrayList();
//		
//		al.add("Sachin");
//		al.add("Rahul");
//		
//		// Compiler allow this
//		al.add(10);
//		
//		String s1 = (String)al.get(0);
//		String s2 = (String)al.get(1);
//		
//		// Causes Runtime Exception
//		Integer s3 = (Integer)al.get(2);
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sachin");
		al.add("Rahul");
		
		// Compiler allow this
		//al.add(10);
		
		String s1 = al.get(0);
		String s2 = al.get(1);
		
		
		
		
		
	}
}
