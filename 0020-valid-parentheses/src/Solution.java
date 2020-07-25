import java.util.LinkedList;
import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {

            if (c == '(' || c == '{' || c == '[')
                stack.add(c);
            else {
                if (stack.isEmpty())
                    return false;

                char left = stack.pop();

                if (left == '(' && c != ')')
                    return false;
                else if (left == '{' && c != '}')
                    return false;
                else if (left == '[' && c != ']')
                    return false;
            }
        }

        return stack.isEmpty();
    }
}