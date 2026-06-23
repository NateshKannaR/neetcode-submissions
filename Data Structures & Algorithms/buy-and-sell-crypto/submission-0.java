class Solution {
    public int maxProfit(int[] prices) {
        int m=prices[0];
        int n=0;
        for(int i=1;i<prices.length;i++){
            m=Math.min(m,prices[i]);
            n=Math.max(n,(prices[i]-m));
        }
        return n;
    }
}
