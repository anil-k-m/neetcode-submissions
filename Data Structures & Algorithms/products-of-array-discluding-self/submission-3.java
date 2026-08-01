class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int[] result = new int[numsLength];
        
        int tempProduct = 1;
        for (int i = 0; i < numsLength; i++) {
            result[i] = tempProduct;
            tempProduct *= nums[i];
        }

        tempProduct = 1;
        for (int i = numsLength - 1; i >= 0; i--) {
            result[i] *= tempProduct;
            tempProduct *= nums[i];
        }

        return result;
    }
}  
