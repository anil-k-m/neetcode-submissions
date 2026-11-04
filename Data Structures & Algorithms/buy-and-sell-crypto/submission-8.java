class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = prices[0];
        for (int price : prices) {
            if (price < lowestPrice) {
                lowestPrice = price;
                continue;
            }
            if (price - lowestPrice > maxProfit) {
                maxProfit = price - lowestPrice;
            }
        }
        return maxProfit;
    }
}
