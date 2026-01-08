class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ch=new HashSet<>();
        int maxlength=0;
        int start=0;
        for(int end=0;end<s.length();end++)
        {
            while(ch.contains(s.charAt(end)))
            {
                ch.remove(s.charAt(start));
                start++;
            }


ch.add(s.charAt(end));
maxlength=Math.max(maxlength,end-start+1);
            
        }
        return maxlength;
        
    }
}