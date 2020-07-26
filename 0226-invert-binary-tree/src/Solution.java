class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null)
            return null;

        // 交换节点
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;

        // 向下交换
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}