class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private int height(TreeNode node) {
        if (node == null)
            return -1;
        return Math.max(height(node.left),height(node.right)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        return Math.abs(height(root.left)-height(root.right)) < 2 &&
                isBalanced(root.left) &&
                isBalanced(root.right);
    }
}