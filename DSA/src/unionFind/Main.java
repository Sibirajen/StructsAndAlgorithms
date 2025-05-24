package unionFind;

public class Main {
    public static void main(String[] args) {
        UnionFindRank uf = new UnionFindRank(5);
        uf.union(0,1);
        uf.union(2,1);
        uf.union(3,2);
        uf.union(4,3);
        System.out.println(uf.find(0));
        System.out.println(uf.find(1));
        System.out.println(uf.find(2));
        System.out.println(uf.find(3));
        System.out.println(uf.find(4));
    }
}
