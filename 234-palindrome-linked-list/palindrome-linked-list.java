class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true; // An empty list or a single node list is considered palindrome
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find the midpoint of the linked list
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        ListNode prev = null;
        ListNode current = slow.next;
        while (current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Now, 'prev' points to the head of the reversed second half
        ListNode p1 = head;
        ListNode p2 = prev;
        while (p2 != null) {
            if (p1.val != p2.val) {
                return false; // If values don't match, it's not a palindrome
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true; // If we reach here, it means it's a palindrome
    }
}
