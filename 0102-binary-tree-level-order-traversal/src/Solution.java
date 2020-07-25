import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {

            int size = q.size();
            ArrayList<Integer> tmp = new ArrayList<Integer>();

            for (int i = 0; i < size; i ++) {

                TreeNode node = q.remove();
                tmp.add(node.val);

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);
            }

            ans.add(tmp);
        }

        return ans;
    }
}