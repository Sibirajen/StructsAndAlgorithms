package unionFind;

public class UnionFindPC {
    private final int[] parent;

    public UnionFindPC(int size) {
        this.parent = new int[size];
        for(int i=0;i<size;i++) parent[i] = i;
    }

    public void union(int i, int j){
        parent[find(i)] = find(j);
    }

    public int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
}
