/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
        {
            System.out.println("null");
        }
        ListNode pointera=headA;
        ListNode pointerb=headB;
        while(pointera!=pointerb)
        {
            if(pointera==null)
            {
                pointera=headB;
            }
            else
            {
                pointera=pointera.next;
            }

               if(pointerb==null)
            {
                pointerb=headA;
            }
            else
            {
                pointerb=pointerb.next;
            }
        
        }
        return pointera;
    }
}