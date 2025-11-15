/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        {
            return null;
        }
        if(root==p || root==q)
        {
            return root;
        }
        TreeNode lleft=lowestCommonAncestor(root.left,p,q);
        TreeNode lright=lowestCommonAncestor(root.right,p,q);
        if(lleft!=null && lright!=null)
        {
            return root;
        }
        else if(lleft!=null)
        {
            return lleft;
        }
        else
        {
            return lright;
        }
    }
}