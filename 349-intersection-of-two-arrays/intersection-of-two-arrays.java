class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int x: nums1){
            set1.add(x);
        }

        Set<Integer> result = new HashSet<>();
        for(int x: nums2){
            if(set1.contains(x)) result.add(x);
        }

        int [] arr = new int[result.size()];
        int index = 0;
        for(int num: result) arr[index++] = num;
        return arr;
    }
}