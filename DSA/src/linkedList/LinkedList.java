package linkedList;

class ListNode {
  int val;
  ListNode next;
  ListNode(){}
  ListNode(int val){ this.val = val; }
  ListNode(int val,ListNode next){ this.val = val; this.next = next; }
}
public class LinkedList {
  ListNode head;
  public void traverse(){
    ListNode curr = head;
    while(curr != null){
      System.out.print(curr.val + "->");
      curr = curr.next;
    }
    System.out.println("end");
  }
  public boolean contains(int val){
    ListNode curr = head;
    while(curr != null){
      if(curr.val == val){
        return true;
      }
      curr = curr.next;
    }
    return false;
  }
  public int size(){
    ListNode curr = head;
    int size = 0;
    while(curr != null){
      size++;
      curr = curr.next;
    }
    return size;
  }
  public void addFirst(int val){
    ListNode node = new ListNode(val,null);
    if (head != null) {
      node.next = head;
    }
    head = node;
  }
  public void add(int val){
    ListNode node = new ListNode(val,null);
    if(head == null){
      head = node;
    }
    else{
      ListNode curr = head;
      while(curr.next != null){
        curr = curr.next;
      }
      curr.next = node;
    }
  }
  public void add(int val,int pos){
    if(pos < 0 || pos > size()){
      System.out.println("Invalid position");
      return;
    }
    ListNode node = new ListNode(val,null);
    if(pos == 0){
      addFirst(val);
    }
    else if(pos == size()){
      add(val);
    }
    else{
      ListNode prev = null;
      ListNode curr = head;
      int count = 0;
      while(count != pos){
        prev = curr;
        curr = curr.next;
        count++;
      }
      prev.next = node;
      node.next = curr;
    }
  }
  public void removeFirst(){
    if(head == null){
      System.out.println("Empty List...");
      return;
    }
    if(head.next == null){
      head =  null;
    }
    else{
      head = head.next;
    }
  }
  public void remove(){
    if(head == null){
      System.out.println("Empty List...");
      return;
    }
    if(head.next == null){
      head = null;
    }
    else{
      ListNode curr = head;
      ListNode prev = null;
      while(curr.next != null){
        prev = curr;
        curr = curr.next;
      }
      prev.next = null;
    }
  }
  public void remove(int pos){
    if(pos < 0 || pos > size()){
      System.out.println("Invalid Position");
      return;
    }
    if(head == null){
      System.out.println("Empty List...");
      return;
    }
    if(pos == 0){
      removeFirst();
    }
    else{
      int count = 0;
      ListNode curr = head;
      while(count != pos-1){
        curr = curr.next;
        count++;
      }
      curr.next = curr.next.next;
    }
  }
}