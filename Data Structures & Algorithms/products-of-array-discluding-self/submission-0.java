class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        
        int[] suffixProd = new int[numsLength];
        int tempProduct = 1;
        for (int i = 0; i < numsLength; i++) {
            suffixProd[i] = tempProduct;
            tempProduct *= nums[i];
        }

        int[] prefixProd = new int[numsLength];
        tempProduct = 1;
        for (int i = numsLength - 1; i >= 0; i--) {
            prefixProd[i] = tempProduct;
            tempProduct *= nums[i];
        }

        int[] result = new int[numsLength];
        for (int i = 0; i < numsLength; i++) {
            result[i] = prefixProd[i] * suffixProd[i];
        }

        return result;
    }
}  
