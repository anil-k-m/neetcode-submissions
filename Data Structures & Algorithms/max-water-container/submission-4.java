class Solution {
    public int maxArea(int[] heights) {
        int front = 0;
        int end = heights.length - 1;
        int maxVolume = 0;
        while(front < end) {
            int volume = Math.min(heights[front], heights[end]) * (end - front);
            maxVolume = Math.max(volume, maxVolume);
            if (heights[front] > heights[end]) {
                end--;
            } else {
                front++;
            }
        }
        return maxVolume;
    }
}
