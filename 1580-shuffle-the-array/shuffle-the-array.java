/*
Time: 0 ms (100.00%) | Memory: 46.50 MB (82.16%) - LeetSync
Intuition
I need to put ith element and (i+n)th together

Approach
Iterated through the given array less then n times and put ith and (i+n)th element together.

Complexity
Time complexity:
O(n)

Space complexity:
O(n)
*/    
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for(int i=0; i< n; i++){
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[i + n];
        }
        return arr;
    }
}
