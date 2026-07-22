class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> output = new HashMap<>();
        for (String s : strs) {
            char[] charCounts = new char[26];
            for (char c: s.toCharArray()) {
                charCounts[c - 'a']++;
            }
            output.computeIfAbsent(new String(charCounts), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(output.values());
    }
}
