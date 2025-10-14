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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pd=dummy;
        ListNode curr=head;
        for(int i=0;i<left-1;i++)
        {
            curr=curr.next;
            pd=pd.next;
        }
        ListNode prev=null;
        ListNode chead=curr;
        for(int i=0;i<right-left+1;i++)
        {
            ListNode cnext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=cnext;
        }

        pd.next=prev;
        chead.next=curr;
        return dummy.next;

        
    }
}