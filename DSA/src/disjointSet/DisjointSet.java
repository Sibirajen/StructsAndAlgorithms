package disjointSet;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    private final List<Integer> parent;
    private final List<Integer> rank;
    private final List<Integer> size;

    public DisjointSet(int n) {
        this.parent = new ArrayList<>();
        this.rank = new ArrayList<>();
        this.size = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            size.add(1);
            rank.add(0);
            parent.add(i);
        }
    }

    public int findParent(int node) {
        if(node == parent.get(node)) {
            return node;
        }
        int ulp = findParent(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void union(int u, int v) {
        unionByRank(u, v);
        unionBySize(u, v);
    }

    private void unionByRank(int u, int v) {
        int ulpU = findParent(u);
        int ulpV = findParent(v);

        if(ulpU == ulpV) return;
        if(rank.get(ulpU) < rank.get(ulpV)) {
            parent.set(ulpU, ulpV);
        } else if (rank.get(ulpV) < rank.get(ulpU)) {
            parent.set(ulpV, ulpU);
        } else {
            parent.set(ulpV, ulpU);
            rank.set(ulpU, rank.get(ulpU) + 1);
        }
    }

    private void unionBySize(int u, int v) {
        int ulpU = findParent(u);
        int ulpV = findParent(v);

        if(ulpU == ulpV) return;
        if(size.get(ulpU) < size.get(ulpV)) {
            parent.set(ulpU, ulpV);
            size.set(ulpV, size.get(ulpV)+size.get(ulpU));
        } else {
            parent.set(ulpV, ulpU);
            size.set(ulpU, size.get(ulpV)+size.get(ulpU));
        }
    }
}
