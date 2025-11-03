package generics;

public class GenericsMultipleType<T, U> {
	T obj1;
	U obj2;
	
	// Constructor
	GenericsMultipleType(T obj1, U obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	// To print objects of T and U
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}

}

class MainType{
	public static void main(String args[]) {
		GenericsMultipleType <Integer, String> obj = 
				new GenericsMultipleType<Integer, String>(12, "Soumitra");
		obj.print();
	}
}
