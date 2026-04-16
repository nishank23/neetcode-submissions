/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
     public ListNode reverseList(ListNode head) {
        // 1. The Base Case: If the list is empty or has one node, it's already reversed.
        if (head == null || head.next == null) {
            return head;
        }

        // 2. The Recursive Step: Go reverse the REST of the list.
        //    This call will return the new head of the reversed list (the original tail).
        ListNode newHead = reverseList(head.next);

        // 3. The "Work": This is where YOUR two brilliant ideas go!
        //    Make the next node point back to the current one.
        head.next.next = head;
        //    Make the current node the new tail.
        head.next = null;

        // 4. The Return: Always return the new head of the entire list.
        return newHead;
    }
}
