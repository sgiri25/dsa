package graph;

class AdjNode {
	int vertex;
	AdjNode next;
	
	public AdjNode(int data) {
		//System.out.println(data);
		vertex = data;
		next = null;
	}
}
public class AddRemoveVertex {
	private int v;
	private AdjNode[] graph;
	
	public AddRemoveVertex(int vertices) {
		v = vertices;
		//AdjNode an = new AdjNode(v);
		graph = new AdjNode[v];
		for(int i = 0; i < v; ++i) {
			graph[i] = null;
		}
		
		
	}
	public void addEdge(int source, int destination) {
		AdjNode node = new AdjNode(destination);
		node.next = graph[source];
		graph[source] = node;
	}
	public void printGraph() {
		for(int i = 0; i < 6; i++) {
			System.out.print(i + " ");
			AdjNode temp = graph[i];
			
			while(temp != null) {
				System.out.print("-> " + temp.vertex + " ");
                temp = temp.next;
			}
			System.out.println();
		}
	}
	public void addVertex(int vk, int source, int destination) {
		addEdge(source, vk);
		addEdge(vk, destination);
	}
	public void delVertex(int k) {
		for (int i = 0; i < v; i++) {
			AdjNode curr = graph[i], prev = null;
			while(curr != null) {
				if(curr.vertex == k) {
					if(prev == null) {
						graph[i] = curr.next;
					}
					else {
						prev.next = curr.next;
					}
					break;
				}
				prev = curr;
				curr = curr.next;
			}
		}
	}
	public static void main(String args[]) {
		int V = 6;
		AddRemoveVertex graph = new AddRemoveVertex(V);
		graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(3, 2);
        graph.addEdge(4, 3);
        
        System.out.println("Initial adjacency list");
        graph.printGraph();
        
        // Add vertex
        graph.addVertex(5, 3, 2);
        System.out.println("Adjacency list after adding vertex");
        graph.printGraph();
        
        // Delete vertex
        graph.delVertex(4);
        System.out.println("Adjacency list after deleting vertex");
        graph.printGraph();
	}
}
