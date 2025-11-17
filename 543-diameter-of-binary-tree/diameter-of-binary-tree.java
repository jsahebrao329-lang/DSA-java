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

    int diameter = 0;   // global variable to store max diameter

    int height(TreeNode root) {
        if (root == null) return 0;

        // compute left and right subtree heights
        int lh = height(root.left);
        int rh = height(root.right);

        // update the global diameter
        diameter = Math.max(diameter, lh + rh);

        // return height of current node
        return Math.max(lh, rh) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);   // this will compute height and update diameter
        return diameter;
    }
}

 