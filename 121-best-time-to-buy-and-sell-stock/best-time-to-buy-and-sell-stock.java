class Solution {
    public int maxProfit(int[] prices) {
        
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;

        // first find the min prices
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            // Now find the maxPrice
            else if(prices[i] - minPrice > maxPrice){
                maxPrice = prices[i] - minPrice;
            }
        }
        return maxPrice;
    }
}