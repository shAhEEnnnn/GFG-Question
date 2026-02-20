/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
      if(head ==null || head.next ==null) return null;
      Node s = head;
      Node f = head;
      Node prev = null;
      
      while(f!=null && f.next!= null){
          prev = s;
          s=s.next;
          f=f.next.next;
      }
      prev.next =s.next;
      return head;
    }
}