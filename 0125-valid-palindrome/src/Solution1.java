/**
 * 验证字符串是否为回文串
 * https://leetcode-cn.com/problems/valid-palindrome/
 */
public class Solution1 {

    // 对撞指针
    public boolean isPalindrome(String s) {

        int l = 0, r = s.length() - 1;
        while (l < r){

            while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
                l++;

            while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
                r--;

            if (l < r) {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                    return false;

                l++;
                r--;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
        boolean result = (new Solution1()).isPalindrome(s);
        System.out.println(s);
        System.out.println(result);
    }
}
