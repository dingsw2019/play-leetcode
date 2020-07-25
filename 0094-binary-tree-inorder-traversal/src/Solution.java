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

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null)
            return ans;

        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {

            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode node = stack.pop();
                ans.add(node.val);
                p = node.right;
            }
        }

        return ans;
    }
}