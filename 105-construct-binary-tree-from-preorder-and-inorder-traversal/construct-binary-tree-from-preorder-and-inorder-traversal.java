class Solution {

    int preindex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int left, int right) {

        // base case
        if (left > right) return null;

        // pick root from preorder
        int rootval = preorder[preindex++];
        TreeNode root = new TreeNode(rootval);

        // find root in inorder
        int mid = search(inorder, left, right, rootval);

        // build left & right subtrees
        root.left = helper(preorder, inorder, left, mid - 1);
        root.right = helper(preorder, inorder, mid + 1, right);

        return root;
    }

    private int search(int[] inorder, int start, int end, int target) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }
        return -1; // not found
    }
}
