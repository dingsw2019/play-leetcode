/**
 * 3. 无重复字符的最长子串
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * 滑动窗口实现
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[256];

        int n = s.length();
        int l = 0, r = -1;
        int len = 0;

        while (r+1 < n) {

            if (r + 1 < s.length() && freq[s.charAt(r+1)] == 0)
                freq[s.charAt(++r)]++;
            else
                freq[s.charAt(l++)]--;

            len = Math.max(len, r-l+1);
        }

        return len;
    }

    public static void main(String[] args) {
        System.out.println((new Solution()).lengthOfLongestSubstring( "abcabcbb" ));
        System.out.println((new Solution()).lengthOfLongestSubstring( "bbbbb" ));
        System.out.println((new Solution()).lengthOfLongestSubstring( "pwwkew" ));
        System.out.println((new Solution()).lengthOfLongestSubstring( "" ));
    }
}
