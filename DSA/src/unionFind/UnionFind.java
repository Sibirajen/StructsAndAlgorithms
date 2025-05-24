package unionFind;

public class UnionFind {
    private final int[] parent;

    public UnionFind(int size) {
        this.parent = new int[size];
        for(int i=0;i<size;i++) parent[i] = i;
    }

    public void union(int i, int j){
        parent[find(i)] = find(j);
    }

    public int find(int x){
        if(parent[x] == x) return x;
        else return find(parent[x]);
    }
}
