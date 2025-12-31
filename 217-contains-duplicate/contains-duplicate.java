class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> see=new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
        if(see.contains(nums[i]))
        {
            return true;
        }
        see.add(nums[i]);
       }
     return false;
        }
        
    }
