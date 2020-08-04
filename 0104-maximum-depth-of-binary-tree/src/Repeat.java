class Repeat {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {

        return dfs(root,0);
    }

    private int dfs(TreeNode node, int depth) {

        if (node == null)
            return depth;

        int leftDepth = dfs(node.left,depth+1);
        int rightDepth = dfs(node.right,depth+1);

        return Math.max(leftDepth,rightDepth);
    }
    
}