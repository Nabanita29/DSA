class Solution {
    public int maxProfit(int[] prices) {

        int MinPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
           MinPrice = Math.min(MinPrice, prices[i]);
           if(prices[i] - MinPrice > maxProfit){
                maxProfit = prices[i] - MinPrice;
           }
        }

    return maxProfit;

        
    }
}