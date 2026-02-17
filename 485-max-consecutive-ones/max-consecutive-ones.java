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