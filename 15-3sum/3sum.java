class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){ continue;} // skip duplicate values for the fixed number:
                                                        // same nums[i] would find the same triplets again
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0){
                    r--;
                } else if (sum < 0){
                    l++;
                } else if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    r--;
                    l++;
                    while (l < r && nums[l] == nums[l - 1]) l++; // after a match, skip duplicate values for l:// same nums[l] with the same nums[i] would repeat this triplet
                }
                
            }
        }
        return list;
    }
}