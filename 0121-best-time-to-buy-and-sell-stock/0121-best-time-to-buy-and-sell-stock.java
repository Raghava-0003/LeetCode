public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // update the minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  // update max profit if we get a better profit
            }
        }

        return maxProfit;
    }
}
