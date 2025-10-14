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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prevcurr = head;
        ListNode curr = head.next;

        while(curr != null) {
            if(curr.val >= prevcurr.val) {
                prevcurr = curr;
                curr = curr.next;
            } else {
                ListNode prev = null;
                ListNode h1 = head;

                // Find the correct position to insert curr
                while(h1 != curr && h1.val < curr.val) {
                    prev = h1;
                    h1 = h1.next;
                }

                // Remove curr from its current position
                prevcurr.next = curr.next;

                // Insert at head
                if(prev == null) {
                    curr.next = head;
                    head = curr;
                } else { // Insert in middle
                    prev.next = curr;
                    curr.next = h1;
                }

                // Move curr to next node to process
                curr = prevcurr.next;
            }
        }

        return head;
    }
}
