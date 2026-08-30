import java.util.HashMap;

class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char cht = t.charAt(i);
            if (!map.containsKey(cht)) {
                return false;
            }
            map.put(cht, map.get(cht) - 1);
            if (map.get(cht) == 0) {
                map.remove(cht);
            }
        }

        return map.isEmpty();
    }
}
