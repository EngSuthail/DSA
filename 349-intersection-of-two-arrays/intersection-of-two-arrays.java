class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int x: nums1){
            set1.add(x);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int x: nums2){
            set2.add(x);
        }

        set1.retainAll(set2);
        int[] arr = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            arr[index++] = num;
        }
        
        return arr;
    }
}