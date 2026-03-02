/*
Time: 1 ms (79.24%) | Memory: 47 MB (7.92%) - LeetSync
Two pointers approach used.
In starting of the iteration, l and r are pointing to first element.
Each iteration r is increased. When there are unequal element appear l increased and swapped with r.
l+1 will give how many elements are uniquely ordered.

Time complexity - O(n)
Space complexity - O(1)
*/

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
