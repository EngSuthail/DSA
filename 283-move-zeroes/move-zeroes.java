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