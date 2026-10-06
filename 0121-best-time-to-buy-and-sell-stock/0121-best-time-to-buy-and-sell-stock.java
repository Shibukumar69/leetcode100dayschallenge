class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            int profit = prices[i] - min;

            if (profit > ans) {
                ans = profit;
            }
        }
        return ans;
    }
}