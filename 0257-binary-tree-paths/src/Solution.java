import java.util.LinkedList;
import java.util.List;

class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> pathList = new LinkedList<>();
        paths(root,"",pathList);
        return pathList;
    }

    private void paths(TreeNode root, String path, List<String> paths) {

        if (root != null) {

            path += Integer.toString(root.val);
            if (root.left == null && root.right == null) {
                paths.add(path);
            } else {
                path += "->";
                paths(root.left,path,paths);
                paths(root.right,path,paths);
            }
        }
    }
}