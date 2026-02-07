/*
Intuition
I realized i needed to sum each of the elements of the array with each of them to find the target

Approach
Pick a number from the array(x) which is first loop and iterate through the array to find the other value which is target - x which is the inner loop.

Complexity
Time complexity:
O(n^2)
It has loop inside a loop and in worst case it has to iterate through all of them

Space complexity:
O(1)
There is no other data structures used that grow with input sizes. Only few variables used.
*/

class Solution {
    int a, b;
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++){
            boolean flag = false;
            int x = nums[i];
            for(int j = i+1;  j < nums.length; j++){
                if(nums[j] == target - x){
                    b = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                a = i;
            }
        }
        int[] result = new int[2];
        result [0] = a;
        result [1] = b;
        return result;
    }
}
