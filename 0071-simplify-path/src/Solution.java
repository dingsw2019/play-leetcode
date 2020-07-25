import java.util.Stack;

class Solution {

    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        String[] str = path.split("/");

        for (String s : str) {

            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.equals("") && !s.equals(".")) {
                stack.push(s);
            }
        }

        if (stack.isEmpty()){
            return "/";
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < stack.size(); i ++)
            ans.append("/" + stack.get(i));

        return ans.toString();
    }
}