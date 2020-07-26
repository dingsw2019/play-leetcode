class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode(int x) { val = x; }
        TreeNode right;
    }

    public int minDepth(TreeNode root) {

        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        int depth = Integer.MAX_VALUE;

        if (root.left != null)
            depth = Math.min(minDepth(root.left), depth);

        if (root.right != null)
            depth = Math.min(minDepth(root.right), depth);

        return depth+1;
    }
}