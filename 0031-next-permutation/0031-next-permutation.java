class Solution {
    public void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length - 1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        //break point
        int idx = -1;
        int idx1 = -1;
        for(int i =nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1) 
            reverse(nums,0);
        else{
            for(int i = nums.length-1;i>=idx;i--){
                if(nums[i]>nums[idx]){
                    idx1 = i;
                    break;
                }
            }
            swap(nums,idx,idx1);
            reverse(nums,idx+1);
        } 
    }
}