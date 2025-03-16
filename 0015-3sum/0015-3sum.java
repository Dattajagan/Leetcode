class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();


            int j,k;
            for(int i=0;i<n-2;i++)
            {
                j = i+1;
                k = n-1;

                if(i>0 && nums[i] == nums[i-1]) 
                    continue;

                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if(sum > 0){
                        /* want an smaller element */
                        k--;
                    }
                    else if(sum < 0 )
                    {
                        j++;
                    }
                    else{
                        
                        list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                        j++;
                        k--;

                        while(j < k && nums[j] == nums[j-1])
                            j++;
                        while(j < k && nums[k] == nums[k+1])
                            k--;
                    }
                }
            }

            return list;

    }
}