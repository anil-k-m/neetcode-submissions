class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest =  0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int step = 1;
                while(numSet.contains(num + step)) {
                    step++;
                }
                longest = Math.max(longest, step);
            }
        }
        return longest;
    }
}
