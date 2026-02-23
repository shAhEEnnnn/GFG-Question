class Solution {
   static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null){
           Node fwd = curr.next;
            curr.next =prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public boolean isPalindrome(Node head) {
    //o(1) space complexity
    if(head == null || head.next == null) return true;
    Node slow = head;
    Node fast = head;
    while(fast.next != null && fast.next.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node head2 = slow.next;
    slow.next = null;
    head2 = reverse(head2);
    Node i = head;
    Node j = head2;
    while(j!=null){
        if(i.data != j.data) return false;
        i = i.next;
        j= j.next;
    }
    return true;
    
        
    //   Node temp = head;
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     while(temp!=null){
    //         arr.add(temp.data);
    //         temp = temp.next;
    //     }
    //     int i=0, j=arr.size()-1;
    //     while(i<j){
    //         int a=arr.get(i), b=arr.get(j);
    //         if(a!=b) return false;
    //         i++;
    //         j--;
    //     }
    //     return true;
        
    }
}