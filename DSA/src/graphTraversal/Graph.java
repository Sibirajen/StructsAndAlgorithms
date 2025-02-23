package graphTraversal;

import java.util.*;

public class Graph {
    private final Map<Character, List<Character>> adjList;
    private final int[][] adjMat;
    private final char[] vertexData;
    private final int size;
    private final boolean[] visited;

    public Graph(int size){
        this.size = size;
        this.adjList = new HashMap<>();
        this.adjMat = new int[size][size];
        this.vertexData = new char[size];
        this.visited = new boolean[size];
    }

    public void addVertex(int i, char vertex){
        if(i > -1 && i < size){
            vertexData[i] = vertex;
            return;
        }
        System.out.println("Invalid index");
    }

    public void addEdge(int i, int j){
        if(i>-1 && i < size && j>-1 && j < size) {
            adjMat[i][j] = 1;
            adjMat[j][i] = 1;
            List<Character> list = adjList.getOrDefault(vertexData[i], new ArrayList<>());
            if(!list.contains(vertexData[j])){
                list.add(vertexData[j]);
            }
            adjList.put(vertexData[i], list);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Printing the adjacency matrix
        sb.append("Adjacency Matrix:\n");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(adjMat[i][j]).append(" ");
            }
            sb.append("\n");
        }

        // Printing the adjacency list
        sb.append("\nAdjacency List:\n");
        for (Map.Entry<Character, List<Character>> map: adjList.entrySet()) {
            sb.append(map.getKey()).append(": ");

            // Check if there are any edges for this vertex in the adjacency list
            List<Character> list = map.getValue();
            if (!list.isEmpty()) {
                for (char ch: list) {
                    sb.append(ch).append(" ");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public void bfs(char vertex, Through through){
        Queue<Character> q = new LinkedList<>();

        q.offer(vertex);
        visited[vertex-'A'] = true;

        while (!q.isEmpty()){
            char curr = q.poll();
            System.out.print(curr + " ");

            if(through.equals(Through.adjList)){
                List<Character> list = adjList.get(curr);
                if(list != null && !list.isEmpty()){
                    for (char ch : list) {
                        if (!visited[ch - 'A']) {
                            q.offer(ch);
                            visited[ch - 'A'] = true;
                        }
                    }
                }
            }
            else {
                for (int i = 0; i < vertexData.length; i++) {
                    if (adjMat[curr - 'A'][i] == 1 && !visited[i]) {
                        q.offer((char) (i + 'A'));
                        visited[i] = true;
                    }
                }
            }
        }
    }

    public void bfsDisconnected(Through through){
        if(through.equals(Through.adjList)){
            for(char vertex: adjList.keySet()){
                if(!visited[vertex-'A']) {
                    bfs(vertex, Through.adjList);
                    System.out.println();
                }
            }
        }
        else{
            for(int i=0;i<size;i++){
                if(!visited[i]){
                    bfs((char) (i+'A'), Through.adjMat);
                    System.out.println();
                }
            }
        }
    }
}
