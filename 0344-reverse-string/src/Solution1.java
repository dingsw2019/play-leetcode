/**
 * 反转字符串
 * https://leetcode-cn.com/problems/reverse-string/
 */
public class Solution1 {

    public void reverseString(char[] s) {

        int l = 0, r = s.length - 1;

        while (l < r) {
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
//        char[] s = {'h','e','l','l','o'};
        char[] s = {'H','a','n','n','a','h'};
        (new Solution1()).reverseString(s);

        for (int i = 0; i < s.length; i ++)
            System.out.print(s[i] + " ");

        System.out.println();
    }
}
