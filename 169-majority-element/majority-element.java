class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        HashMap <Integer, Integer> store = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(store.containsKey(nums[i])){
                store.put(nums[i], store.getOrDefault(nums[i], 0) + 1);
            } else {
                store.put(nums[i], 1);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(store.get(nums[i]) > nums.length/2){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}