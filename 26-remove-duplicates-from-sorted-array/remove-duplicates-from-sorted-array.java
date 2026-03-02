class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0, r = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[l] != nums[r]){
                l++;
                swap(nums, l, r);
            }
            r++;
        }
        return l+1;
    }    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }       
    
}