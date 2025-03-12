class Solution {
    public int maximumCount(int[] nums) {
        int nve =0;//nve = negative
        int pve=0;// pve = positive
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0){
                nve++;
            }
            else if (nums[i]<0){
                pve++;
            }
        }
        if (nve>pve){
            return nve;
        }
        return pve;
    }
}