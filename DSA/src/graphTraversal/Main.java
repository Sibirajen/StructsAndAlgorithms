package graphTraversal;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(10);  // Create a graph with 10 vertices

        // Adding vertices labeled A through J
        g.addVertex(0, 'A');
        g.addVertex(1, 'B');
        g.addVertex(2, 'C');
        g.addVertex(3, 'D');
        g.addVertex(4, 'E');
        g.addVertex(5, 'F');
        g.addVertex(6, 'G');
        g.addVertex(7, 'H');
        g.addVertex(8, 'I');
        g.addVertex(9, 'J');

        // Adding edges
        g.addEdge(0, 1);  // A - B
        g.addEdge(0, 2);  // A - C
        g.addEdge(0, 3);  // A - D
        g.addEdge(0, 4);  // A - E
        g.addEdge(1, 2);  // B - C
        g.addEdge(1, 3);  // B - D
        g.addEdge(1, 4);  // B - E
        g.addEdge(2, 3);  // C - D
        g.addEdge(2, 4);  // C - E
//        g.addEdge(2, 6);  // C - G comment this
//        g.addEdge(2, 9);  // C - J and this to make the graph disconnected
        g.addEdge(3, 4);  // D - E
        g.addEdge(5, 6);  // F - G
        g.addEdge(6, 7);  // G - H
        g.addEdge(7, 8);  // H - I
        g.addEdge(8, 9);  // I - J
        g.addEdge(5, 8);  // F - I
        g.addEdge(6, 9);  // G - J
        g.addEdge(5, 7);  // F - H

        System.out.println(g);
//        g.bfs('A', Through.adjMat);
//        g.bfs('A', Through.adjList);
//        A → B → C → D → E → G → J → H → I

        g.bfsDisconnected(Through.adjMat);
//        g.bfsDisconnected(Through.adjList);
//        A -> B -> C -> D -> E
//        F -> G -> H -> I -> J
    }
}
