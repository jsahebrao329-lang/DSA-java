class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=find(nums,target);
        int right=find1(nums,target); 
        return new int[]{left,right};     
    }
    private int find(int[] nums,int target)
    {
        int idx=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                idx=mid;
                right=mid-1;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
            
        }
         return idx;
       
    }
    private int find1(int[] nums,int target)
    {
        int left=0;
        int idx=-1;
        int right=nums.length-1;
        while(left<=right)
        {
        int mid=left+(right-left)/2;
        if(nums[mid]==target)
        {
            idx=mid;
             left=mid+1;
        }
        else if(nums[mid]<target)
        {
            left=mid+1;
        }
        else
        {
            right=mid-1;
        }
        }
        return idx;
    }
}