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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> s=new Stack<>();
        ArrayList<Integer>result=new ArrayList<>();
         TreeNode curr=root;
       
         while(curr!=null || !s.isEmpty())
{
    while(curr!=null)
    {
     
          s.push(curr);
             result.add(curr.val);
        curr=curr.left;
       }

    curr=s.pop();
      curr=curr.right;
  
}

 
return result;     
    }
}