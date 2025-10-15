/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null )
        {
            return null;
        }
        //copy your origional list
        Node curr=head;
        while(curr!=null)
        {
            Node newNode=new Node(curr.val);
            newNode.next=curr.next;
            curr.next=newNode;
            curr=newNode.next;

        }
        
        //copy all random pointer
        curr=head;
       
        while(curr!=null)
        {
            if(curr.random!=null)
            {
                curr.next.random=curr.random.next;
               

            }
             curr=curr.next.next;
        }
            curr=head;
            Node newhead=head.next;
           
            Node newcurr=newhead;
            while(curr!=null)
            {
                curr.next=newcurr.next;
                curr=curr.next;
                if(curr!=null)
                {
                newcurr.next=curr.next;
                newcurr=newcurr.next;
                }

            }
        
        return newhead;
    }
}