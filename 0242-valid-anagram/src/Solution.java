import java.util.HashMap;

class Solution {

    public boolean isAnagram(String s, String t) {

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        HashMap<Character,Integer> mapS = new HashMap<>();
        for (char c : arrS) {
            if (mapS.containsKey(c)) {
                mapS.put(c,mapS.get(c)+1);
            } else {
                mapS.put(c,1);
            }
        }

        for (char c : arrT) {
            if (!mapS.containsKey(c))
                return false;
            mapS.put(c,mapS.get(c)-1);
            if (mapS.get(c) < 0)
                return false;
        }

        for (char c : mapS.keySet())
            if (mapS.get(c) != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

//        String s = "rat";
//        String t = "car";

        boolean is = (new Solution()).isAnagram(s,t);
        System.out.println(is);
    }
}