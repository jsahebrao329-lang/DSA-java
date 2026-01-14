class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currsum=0;
        int minlen=Integer.MAX_VALUE;
        int left=0;
        int high=0;
        while(high<nums.length)
        {
            currsum+=nums[high];
            high++;
            while(currsum>=target)
            {
                 int currsize=high-left;
                 minlen=Math.min(currsize,minlen);
                 currsum-=nums[left];
                 left++;
            }
        }
        return minlen==Integer.MAX_VALUE ?0:minlen;
    }
}