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