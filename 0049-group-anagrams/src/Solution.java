import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List> maps = new HashMap<String, List>();

        for (String s : strs) {

            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);

            if (!maps.containsKey(key))
                maps.put(key,new ArrayList());

            maps.get(key).add(s);
        }

        return new ArrayList(maps.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = (new Solution()).groupAnagrams(words);

        System.out.println(res);
    }
}
