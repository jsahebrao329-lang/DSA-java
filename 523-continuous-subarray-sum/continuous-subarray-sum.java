class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> s=new HashMap<>();
        s.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(s.containsKey(sum%k))
            {
                int idx=s.get(sum%k);
                if(i-idx>=2)
                {
                    return true;
                }

            }
            else
            {
            s.put(sum%k,i);
        }}
        
        return false;
    
        
        
    }
}