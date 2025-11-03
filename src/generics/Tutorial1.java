package generics;

public class Tutorial1<T> {
	T obj;
	Tutorial1(T obj){
		this.obj = obj;
	}
	public T getObject() {
		return this.obj;
	}
}

class Main{
	public static void main(String args[]) {
		Tutorial1<Integer> iObj = new Tutorial1<Integer>(15);
		System.out.print(iObj.getObject());
		
		Tutorial1<String> sObj = new Tutorial1<String>("Soumitra");
		System.out.print(sObj.getObject());
		
	}
}