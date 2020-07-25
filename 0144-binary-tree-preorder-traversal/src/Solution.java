import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null)
            return ans;

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            ans.add(node.val);

            if (node.right != null)
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
        }

        return ans;
    }
}