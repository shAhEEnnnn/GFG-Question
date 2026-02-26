class Solution {
    Node deleteNode(Node head, int key) {
      
        if (head == null) return null;

        Node curr = head;
        Node prev = null;

        // 🔴 delete head case
        if (head.data == key) {

            // single node
            if (head.next == head) return null;

            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            last.next = head.next;
            return head.next;
        }

        // 🔵 delete other node
        do {
            prev = curr;
            curr = curr.next;

            if (curr.data == key) {
                prev.next = curr.next;
                return head;
            }

        } while (curr != head);

        // key not found
        return head;
        
    }
}