/*
Time: 1 ms (97.18%) | Memory: 42.8 MB (41.79%) - LeetSync
Used binary search to find the square root of the number(since a given number's square root is within 0 to that number)
used long for low and high to prevent overflow.
To find the floor value, everytime the square is less than the value, storing it using ans variable. 
*/

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
