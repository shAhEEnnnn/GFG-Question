class Solution {
    public Node reverse(Node head) {
       Node pre=null;
       Node curr = head;
     
       while(curr!=null){
           Node next = curr.next;
          
           curr.next = pre;
           curr.prev= next;
           pre = curr;
           curr = next;
           
       }
       return pre;
       
        
    }
}