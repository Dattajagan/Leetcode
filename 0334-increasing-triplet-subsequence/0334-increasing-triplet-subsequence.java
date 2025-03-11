class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int m = Integer.MAX_VALUE;
        int n = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= m) {
                m = num;
            } else if (num <= n) {
                n = num;
            } else {
                return true;
            }
        }
        
        return false;
    }
}