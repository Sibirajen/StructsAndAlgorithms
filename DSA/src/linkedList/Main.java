package linkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList ls = new LinkedList();
    for(int i=10;i<=50;i+=10){
      ls.add(i);
    }
    ls.addFirst(0);
    ls.traverse();
    System.out.println(ls.size());
    ls.add(35,4);
    ls.traverse();
    System.out.println(ls.contains(35));
    ls.remove();
    ls.traverse();
    ls.removeFirst();
    ls.traverse();
    ls.remove(3);
    ls.traverse();
  }
}
