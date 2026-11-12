class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int max_area = 0;
        while(l < r){            
            int area = (r - l) * Math.min(height[l], height[r]);
            max_area = Math.max(max_area, area);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max_area;
    }
}