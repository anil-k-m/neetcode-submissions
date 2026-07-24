class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countNums = new HashMap<>();
        for (int num : nums) {
            countNums.put(num, countNums.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freqs = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> countEntry : countNums.entrySet()) {
            int freq = countEntry.getValue();
            if (freqs[freq] == null) {
                freqs[freq] = new ArrayList<>();
            }
            freqs[freq].add(countEntry.getKey());
        }

        int[] result = new int[k];
        int resultLen = 0;
        for (int i = freqs.length - 1; i > 0; i--) {
            if (freqs[i] == null) continue;

            for (int n : freqs[i]) {
                result[resultLen++] = n;
                if (resultLen == k) {
                    return result;
                }
            }
        }
        return result;
    }
}
