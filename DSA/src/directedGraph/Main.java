package directedGraph;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4);
        g.addVertex(0, 'A');
        g.addVertex(1, 'B');
        g.addVertex(2, 'C');
        g.addVertex(3, 'D');
        g.addEdge(0, 1, 3); // A -> B with weight 3
        g.addEdge(0, 2, 2); // A -> C with weight 2
        g.addEdge(3, 0, 4); // D -> A with weight 4
        g.addEdge(2, 1, 1); // C -> B with weight 1

        System.out.println(g);
	}

}
