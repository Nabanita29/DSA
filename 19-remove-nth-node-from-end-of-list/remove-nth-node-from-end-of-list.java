class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Let us find length
        int count = 0;
        int nodeposition = 0;

        ListNode temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        // position we remove
        nodeposition = count - n;

        // Now we have to go to this nodeposition and remove the node after it
        ListNode dummy = new ListNode(0); // Create a dummy node to handle edge cases
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = slow.next;
        int x = 0;
        while(x != nodeposition){
            slow = slow.next;
            fast = fast.next;
            x++;
        }
        slow.next = fast.next;
        return dummy.next; // Return dummy.next as head might have been removed
    }
}
