class Solution {
    public int minZeroArray(int[] nums, int[][] q) {
        int n = nums.length;
        int diff[] = new int[n+1];
        for(int i = 1; i<=n; i++){
            diff[i] = 0;
        }
        int sum = 0;
        int pos = 0;
        for(int i = 0 ; i<n ; i++){
            while(sum+ diff[i]<nums[i]){
                if(pos==q.length) return -1;
                int start = q[pos][0];
                int end = q[pos][1];
                int val = q[pos][2];
                pos++;
                if(end<i) continue; 
                diff[Math.max(start,i)] += val;
                diff[(end)+1] -= val;
            }
            sum += diff[i];
        }
        return pos;
    }
}