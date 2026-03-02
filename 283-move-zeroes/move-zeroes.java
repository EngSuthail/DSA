class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0, r = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]!= 0){
                swap(nums, l,r);
                l++;
            }
            r++;
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}