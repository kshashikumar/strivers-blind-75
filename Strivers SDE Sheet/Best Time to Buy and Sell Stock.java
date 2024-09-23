class Solution {
    public int maxProfit(int[] prices) {
        int mn=prices[0],mx=prices[0],ans =0;
        for(int i=1;i<prices.length;i++){
            if(mn>prices[i]){
                mn = prices[i];
                mx = prices[i];
            } else if(mx<prices[i]){
                mx = prices[i];
                if(ans<(mx-mn)){
                    ans = (mx - mn);
                }
            }
        }
        return ans;
    }
}