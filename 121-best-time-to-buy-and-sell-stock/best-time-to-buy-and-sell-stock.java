class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int diff = 0;
        int max_diff = 0;
        for(int i = 0; i< prices.length - 1; i++){
            diff = prices[r] - prices[l];
            if(diff > 0){
                r++;
                if(diff > max_diff){
                    max_diff = diff;
                }
            } else {
                l = r;
                r++;
            }
        }
    
        if(max_diff > 0){
            return max_diff;
        } else{
            return 0;
        }
    }
}