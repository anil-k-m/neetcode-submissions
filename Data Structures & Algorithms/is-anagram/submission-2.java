class Solution {
    public boolean isAnagram(String s, String t) {

        // if lengths of string are not equal, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sCharsMap = new HashMap<>();
        Map<Character, Integer> tCharsMap = new HashMap<>();

        for(char c : s.toCharArray()) {
            sCharsMap.compute(c, (key,value) -> (value == null) ? 1 : value + 1);
        }

        for(char c : t.toCharArray()) {
            tCharsMap.compute(c, (key,value) -> (value == null) ? 1 : value + 1);
        }

        // compare count of chars beteen strings
        return sCharsMap.equals(tCharsMap);
    }
}
