/*
Time: 17 ms (15.42%) | Memory: 51.9 MB (99.52%) - LeetSync
put each element as a key in Hash Map. Value is considered as occurences. Each time if it is there in the map, value is increased by 1.
Time Complexity - O(n)
Space Complexity - O(n)
*/
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
