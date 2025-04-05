class Solution {
    public int[] searchRange(int[] nums, int target) {
        int less = -1;
        int greater_or_eq = nums.length;
        while (greater_or_eq - less > 1) {
            int mid = (less + greater_or_eq) / 2;
            if (nums[mid] < target) {
                less = mid;
            } else {
                greater_or_eq = mid;
            }
        }
        
        int less_or_eq = -1;
        int greater = nums.length;
        while (greater - less_or_eq > 1) {
            int mid = (less_or_eq + greater) / 2;
            if (nums[mid] > target) {
                greater = mid;
            } else {
                less_or_eq = mid;
            }
        }
        
        if (less + 1 <= greater - 1) {
            return new int[]{less + 1, greater - 1};
        }
        return new int[]{-1, -1};
    }
}