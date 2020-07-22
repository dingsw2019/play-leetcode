import java.util.HashMap;

class Solution {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i ++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(s.charAt(i))) {
                if (map.get(c1) != c2)
                    return false;
            } else {
                map.put(c1,c2);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "foo";
        String t = "bar";
        boolean res = (new Solution()).isIsomorphic(s,t);
        System.out.println(res);
    }
}
