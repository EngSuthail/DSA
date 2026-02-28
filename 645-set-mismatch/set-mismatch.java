/*
Time: 14 ms (32.73%) | Memory: 48.1 MB (17.50%) - LeetSync
Used HashMap to solve this problem.
First check if the current value is there in the HashMap. If it is trying to access the same key again i can identify it as the duplicate.
Then again going through the hashmap and finding the missing value.
Time and space complexity is O(n).
*/

import java.util.HashMap;
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] crctArr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            } else{
                crctArr[0] = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(i+1)){
                crctArr[1] = i+1;
            }
        }
        return crctArr;           
    }
}
