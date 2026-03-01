/*
Time: 47 ms (5.08%) | Memory: 48.1 MB (5.55%) - LeetSync
Not an efficient solution. Will try and put an efficient one soon
finding zero in the array, and then iterating over the balanced array to get the first bigger or smaller value in the array and then swap them together.
Time complexity - O(n^2)
Space complexity - O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0){
                for(int j = i + 1; j<nums.length; j++){
                    if(nums[j] > nums[i] || nums[j] < nums[i]){
                        swap(nums, i, j);
                        break;
                    }
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
