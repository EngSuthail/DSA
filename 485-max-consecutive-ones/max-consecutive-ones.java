/*
Time: 2 ms (98.21%) | Memory: 52.5 MB (84.56%) - LeetSync
Intuition - I need to collect the number of 1's until 0. And have to return the maximum number of 1's occuring.
Approach - I store the number of 1s until a 0, and when a zero appears i store it in a variable and made it to zero. Each time i compared the stored value with the
times, if times is bigger than the stored value i put the times to stored value. And i got the edge case problem where the last element ending with 1. So I had to 
compare the values after the for loop as well.

Time complexity - O(n)
Space complexity - O(1)
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int times = 0, store = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1) {
                times++;
            } else{
                if(store < times) store = times;
                times = 0;
            }
        }
        if(store < times) store = times;
        return store;
    }
}
