import java.util.ArrayList;
import java.util.List;

class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        path(root,sum,ans,tmp);
        return ans;
    }

    private void path(TreeNode node,int sum, List<List<Integer>> ans, ArrayList<Integer> tmp) {

        if (node == null)
            return;

        tmp.add(node.val);

        // 叶子节点, 节点和等于 sum
        if (node.left == null && node.right == null && sum == node.val) {
            ans.add(new ArrayList<>(tmp));
        }

        // 处理左右节点
        path(node.left,sum-node.val,ans,tmp);
        path(node.right,sum-node.val,ans,tmp);

        // 如果节点和不等于sum, 删除当前节点
        tmp.remove(tmp.size()-1);
    }
}