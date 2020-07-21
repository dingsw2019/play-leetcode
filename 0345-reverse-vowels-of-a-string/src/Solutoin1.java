/**
 * 345. 反转字符串中的元音字母
 * https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
 */
public class Solutoin1 {

    public String reverseVowels(String s) {

        int l = 0, r = s.length() - 1;
        char[] arr = s.toCharArray();
        String vowel = "aeiouAEIOU";

        while ( l < r ) {

            while (l < r &&  vowel.indexOf(arr[l]) == -1)
                l++;

            while (l < r && vowel.indexOf(arr[r]) == -1)
                r--;

            if (l < r) {
                char t = arr[l];
                arr[l++] = arr[r];
                arr[r--] = t;
            }

        }

        String result = new String(arr);
        return result;
    }

    public static void main(String[] args) {
//        String s = "hello"; // holle
        String s = "leetcode";// leotcede

        String res;
        res = (new Solutoin1()).reverseVowels(s);
        System.out.println(res);
    }
}
