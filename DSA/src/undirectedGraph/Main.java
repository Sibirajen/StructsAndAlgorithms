package undirectedGraph;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4);
        g.addVertex(0, 'A');
        g.addVertex(1, 'B');
        g.addVertex(2, 'C');
        g.addVertex(3, 'D');
        g.addEdge(0, 1);  // A - B
        g.addEdge(0, 2);  // A - C
        g.addEdge(0, 3);  // A - D
        g.addEdge(1, 2);  // B - C

        System.out.println(g);
	}

}
