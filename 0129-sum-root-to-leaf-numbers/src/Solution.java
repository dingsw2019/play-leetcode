import java.util.ArrayList;

class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();

        sum(root,list,tmp);

        int sum = 0;
        for (int n : list)
            sum += n;

        return sum;
    }

    public void sum(TreeNode node, ArrayList<Integer> list, ArrayList<Integer> tmp) {

        if (node == null)
            return;

        tmp.add(node.val);
        if (node.left == null && node.right == null) {
            int sum = 0;
            for (int n : tmp)
                sum = (sum * 10) + n;

            list.add(sum);
        }

        sum(node.left,list,tmp);
        sum(node.right,list,tmp);

        tmp.remove(tmp.size()-1);
    }
}