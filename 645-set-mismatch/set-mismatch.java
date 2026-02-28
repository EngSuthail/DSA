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