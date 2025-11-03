package queue;

public class MainQueue {
	public static void main(String args[]) {
		Reverse sbq = new Reverse();
		sbq.push(1);
		sbq.push(9);
		sbq.push(3);
		sbq.push(5);
		sbq.push(7);
		sbq.pop();
		sbq.reverse();
		//System.out.println(sbq.pop());
		
	}
}
