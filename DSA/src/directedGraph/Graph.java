package directedGraph;

public class Graph {
	private int[][] adjMatrix;
    private char[] vertexData;
    private int size;
    
    public Graph(int size) {
    	this.size = size;
    	this.adjMatrix = new int[size][size];
    	this.vertexData = new char[size];
    }
    
    public void addEdge(int i,int j,int weight) {
    	if(i>-1 && i < size && j>-1 && j < size) {
    		adjMatrix[i][j] = weight;
    	}else {
    		System.out.println("Invalid Index");
    	}
    }
    
    public void addVertex(int i,char vertex) {
    	if(i>-1 && i < size) {
    		vertexData[i] = vertex;
    	}else {
    		System.out.println("Invalid Index");
    	}
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
	    sb.append("Graph Representation:\n");
	    
	    sb.append("Vertices:\n");
	    for (int i = 0; i < size; i++) {
	        sb.append("[").append(i).append("] -> ").append(vertexData[i]).append("\n");
	    }
	    
	    sb.append("\nAdjacency Matrix:\n");
	    for (int i = 0; i < size; i++) {
	        for (int j = 0; j < size; j++) {
	            sb.append(adjMatrix[i][j]).append(" ");
	        }
	        sb.append("\n");
	    }
	    return sb.toString();
	}
    
    
}
