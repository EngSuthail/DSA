class Solution {
    boolean flag;
    public int dominantIndex(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        mergeSort(nums);
        int largest = nums[nums.length-1];
        
        for(int i = 0; i<nums.length - 1; i++){
            flag = false;
            if(largest >= 2 * nums[i]){
                flag = true;
            }
        }
        if(flag) {
            for(int i=0; i < copy.length; i++){
                if(largest == copy[i]){
                    return i;
                }
            }
        }
        return -1;
    }

    public int[] mergeSort(int [] nums){
        if (nums.length > 1){
            int mid = nums.length/2;
            int[] num_B = Arrays.copyOfRange(nums, 0, mid);
            int[] num_C = Arrays.copyOfRange(nums, mid, nums.length);
            mergeSort(num_B);
            mergeSort(num_C);
            merge(num_B, num_C, nums);
        }
        return nums;
    }
    public void merge(int[] num_B,int[] num_C,int[] nums){
        int i = 0, j = 0, k = 0;
        while(i<num_B.length && j<num_C.length){
            if(num_B[i]<= num_C[j]){
                nums[k] = num_B[i];
                i++;
            } else{
                nums[k] = num_C[j];
                j++;
            }
            k++;
        }
        while(i < num_B.length){
            nums[k++] = num_B[i++];
        } 
        while(j < num_C.length){
            nums[k++] = num_C[j++];
        }  
    }
}