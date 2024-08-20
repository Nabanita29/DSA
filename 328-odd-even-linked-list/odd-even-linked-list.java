class Solution {
    public ListNode oddEvenList(ListNode head) {
        // If list is empty or has only one node, return it as it is.
        if (head == null || head.next == null) {
            return head; 
        }
        ListNode odd = head;
        ListNode even = odd.next;     
        ListNode evenHead = even;   

        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next; 
            even = even.next;
        }

        odd.next = evenHead;
        return head;        


    }
}