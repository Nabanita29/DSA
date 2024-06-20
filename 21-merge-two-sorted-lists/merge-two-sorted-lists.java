class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(0); // Dummy node to start the merged list
        ListNode current = list3;

        ListNode slow = list1;
        ListNode fast = list2;

        while (slow != null && fast != null){
            if(fast.val >= slow.val){
                current.next = slow;
                slow = slow.next;
            } else {
                current.next = fast;
                fast = fast.next;
            }
            current = current.next;
        }
        // Attach the remaining part of either list
        if (slow != null) {
            current.next = slow;
        } else {
            current.next = fast;
        }

        return list3.next;
    }
}