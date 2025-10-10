class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0){
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:prices){
            minPrice = Math.min(minPrice,price);
            maxProfit = Math.max(maxProfit,price - minPrice);
        } 
        return maxProfit;
    }
}