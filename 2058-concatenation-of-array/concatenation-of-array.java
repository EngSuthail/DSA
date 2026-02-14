class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = 2*nums.length;
        int[] nums_2 = new int[length];
        for(int i = 0 ; i< nums.length; i++){
            nums_2[i] = nums[i];
            nums_2[i + length/2] = nums[i];
        }
        return nums_2;
    }
}