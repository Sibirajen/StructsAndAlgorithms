package Test;

class ListNode {
  int val;
  ListNode next;
  ListNode(){}
  ListNode(int val){ this.val = val; }
  ListNode(int val, ListNode next){ this.val = val; this.next = next; }
}

public class Main
{
  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(3);
    ListNode m1 = new ListNode(2);
    ListNode m2 = new ListNode(4);
    ListNode m3 = new ListNode(5);

    ListNode h1 = n1;
    n1.next = n2;

    ListNode h2 = m1;
    m1.next = m2;
    m2.next = m3;

    printList(mergeTwoLists(h1,h2));
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    if(list1!=null && list2!=null){
      if(list1.val<list2.val){
        list1.next=mergeTwoLists(list1.next,list2);
        return list1;
      }
      else{
        list2.next=mergeTwoLists(list1,list2.next);
        return list2;
      }
    }
    if(list1==null)
      return list2;
    return list1;
  }

  public static void printList(ListNode head) {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.val + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }
}