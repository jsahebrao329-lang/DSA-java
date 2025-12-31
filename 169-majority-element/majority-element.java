class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int can=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                can=nums[i];
            }
            if(nums[i]==can)
            {
                count=count+1;
            }
            else
            {
                count=count-1;
            }
        }
        return can;
    }
}