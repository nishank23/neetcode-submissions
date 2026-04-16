class Solution {
    public int maxProfit(int[] prices) {
        int cp = prices[0];
        int maxProfit = 0;

        for(int i =1;i<prices.length;i++){
            cp = Math.min(cp,prices[i]);
            int profit = prices[i]-cp;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}
