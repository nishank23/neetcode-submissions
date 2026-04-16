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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int size = 0;
        while(node!=null){
            node=node.next;
            size++;
        }
        int index = size - n ;
        ListNode temp = head;
        while(index>1){
            temp = temp.next;
            index--;
        }
        if(index==0){
            return head.next;
        }
       
            temp.next = temp.next.next;
        
        

        return head;
    }
}
