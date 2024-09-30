class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        int ans=0;
        for(int i:prices)
        {
            profit=i-min;
            min=Math.min(min,i);
            ans=Math.max(profit,ans);
        }
        return ans;
    }
}