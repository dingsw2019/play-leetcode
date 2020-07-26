class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int pathSum(TreeNode root, int sum) {

        if (root == null)
            return 0;

        int ans = findPath(root,sum);
        ans += pathSum(root.left,sum);
        ans += pathSum(root.right,sum);

        return ans;
    }

    private int findPath(TreeNode node, int num) {

        if (node == null)
            return 0;

        int res = 0;
        if (node.val == num)
            res += 1;


        res += findPath(node.left,num - node.val);
        res += findPath(node.right,num - node.val);

        return res;
    }
}