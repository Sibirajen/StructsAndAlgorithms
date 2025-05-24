package unionFind;

public class UnionFindRank {
    private int[] parent;
    private int[] rank;

    public UnionFindRank(int size){
        this.parent = new int[size];
        this.rank = new int[size];
        for(int i=0;i<size;i++) parent[i] = i;
    }

    public int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int i, int j){
        int iRoot = find(i);
        int jRoot = find(j);
        if (iRoot == jRoot) return;
        if(rank[iRoot] < rank[jRoot]){
            parent[iRoot] = jRoot;
        }
        else if(rank[iRoot] > rank[jRoot]){
            parent[jRoot] = iRoot;
        }
        else{
            parent[iRoot] = jRoot;
            rank[jRoot]++;
        }
    }
}
