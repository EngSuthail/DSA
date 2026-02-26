class Solution {
    public int mySqrt(int x) {
        
        long low = 1;
        long high = x;
        int ans = 0;

        while(low <= high){
            long mid = low + (high - low)/2;
            long sqr = mid*mid;

            if(sqr == x){
                return (int) mid;
            } else if( sqr < x){
                ans = (int)mid;
                low = mid + 1;
            } else if ( sqr > x){
                high = mid - 1;
            }
        }
        return ans;        
    }
}