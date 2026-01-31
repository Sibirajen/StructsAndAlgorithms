package disjointSet;

public class Main {
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(7);
        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);
        ds.union(6, 7);
        ds.union(5, 6);

        if(ds.findParent(3) == ds.findParent(7)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        ds.union(3, 7);

        if(ds.findParent(3) == ds.findParent(7)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}
