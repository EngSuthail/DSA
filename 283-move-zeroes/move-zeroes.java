/*
Time: 2 ms (90.15%) | Memory: 48.1 MB (5.53%) - LeetSync
Found that it can be easily solvable by two pointers.
Initially, Left and right pointers are pointing to starting of the array.
In each iteration right pointer moves by one element. If there is a non zero element, it swap with left pointer value, Then left pointer increases by one.

Time complexity - O(n)
Space complexity - O(1)
*/

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
