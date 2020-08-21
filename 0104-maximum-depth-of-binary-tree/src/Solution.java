
class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    

    public int maxDepth(TreeNode root) {
        return depth(root,0);
    }

    private int depth(TreeNode node, int depth) {

        if (node == null) {
            return depth;
        }

        int leftDepth = depth(node.left,depth+1);
        int rightDepth = depth(node.right,depth+1);

        return Math.max(leftDepth,rightDepth);
    }

}