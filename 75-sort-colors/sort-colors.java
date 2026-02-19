class Solution {
    public int[] sortColors(int[] nums) {
        //just implementing the insertion sort here
        int n = nums.length;

        //one by one moving boundary of the unsorted subarray
        for(int i = 0; i < n - 1; i++){
            int minIdx = i;
            for(int j = i+1; j<n; j++){
                if(nums[j]<nums[minIdx]){
                    minIdx = j;
                }
            }
            int temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}