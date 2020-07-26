import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int countNodes(TreeNode root) {

        if (root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int count = 0;
        while (!q.isEmpty()) {
            count++;

            TreeNode node = q.remove();

            if (node.left != null)
                q.add(node.left);

            if (node.right != null)
                q.add(node.right);
        }

        return count;
    }
}