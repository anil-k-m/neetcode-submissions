class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int num : nums) {
            if (numMap.putIfAbsent(num, 1) != null) {
                return true;
            }
        }
        return false;
    }
}