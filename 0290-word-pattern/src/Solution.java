import java.util.HashMap;

public class Solution {

    public boolean wordPattern(String pattern, String str) {

        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> strMap = new HashMap<>();
        String[] arrS = str.split(" ");
        char[] arrP = pattern.toCharArray();

        int index = 0;
        for (char c : arrP) {
            if (!map.containsKey(c) && !strMap.containsKey(arrS[index])) {
                map.put(c,arrS[index]);
                strMap.put(arrS[index],c);
                index++;
            } else {
                if (!map.containsKey(c) || !strMap.containsKey(arrS[index])){
                    return false;
                }

                if (map.get(c).compareTo(arrS[index]) != 0) {
                    return false;
                }

                if (strMap.get(arrS[index]).compareTo(c) != 0) {
                    return false;
                }

                index++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        String pattern = "abba";
//        String str = "dog cat cat dog";

//        String pattern = "abba";
//        String str = "dog cat cat fish";
//        String str = "dog dog dog dog";

        String pattern = "aaaa";
        String str = "dog cat cat dog";

        boolean res;
        res = (new Solution()).wordPattern(pattern,str);
        System.out.println(res);
    }
}
