class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        assert p != null && q != null;

        if (root == null)
            return null;

        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left,p,q);

        if (p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right,p,q);

        return root;
    }
}