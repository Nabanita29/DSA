class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = first.next;

        while(first != null && second != null){
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
            first = first.next != null ? first.next.next : null;
            second = first != null ? first.next : null;
        }
        return head;
    }
}