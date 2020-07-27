import java.util.ArrayList;
import java.util.List;
class Solution {

    private List<String> res;

    private String letterMap[] = {
        " ",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz",
    };

    private void findCombination(String digits, int index, String s) {

        if (index == digits.length()) {
            res.add(s);
            return;
        }

        Character c = digits.charAt(index);
        String letter = letterMap[c - '0'];
        for (int i = 0; i < letter.length(); i ++)
            findCombination(digits,index+1,s + letter.charAt(i));

        return;
    }

    public List<String> letterCombinations(String digits) {

        res = new ArrayList<String>();
        if (digits.equals(""))
            return res;

        findCombination(digits,0,"");
        return res;
    }

}