/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
        {
            return -1;
        }
        Queue<TreeNode> q=new LinkedList<>();
        int sum=0;
        q.add(root);
        while(!q.isEmpty())
        {
                TreeNode curr=q.poll();
                if(curr.left!=null)
                {
                    if(curr.left.left==null && curr.left.right==null)
                    {
                        sum+=curr.left.val;
                    }
                    else
                    {
                        q.add(curr.left);
                    }
                    
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
        }
        return sum;
       
       

      
    }
}