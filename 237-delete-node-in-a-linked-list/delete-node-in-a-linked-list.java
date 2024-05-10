/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // We just simply have to delete the given node no need to start from head
        // so in this problem just change the value of node to the value of the next node
        node.val = node.next.val;
        // change the position
        node.next = node.next.next;
    }
}