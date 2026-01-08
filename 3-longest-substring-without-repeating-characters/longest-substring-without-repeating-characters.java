class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max1=0;
        int left=0;
        HashSet<Character> c=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            while(c.contains(s.charAt(i)))
            {
                c.remove(s.charAt(left));
                left++;
            }
            c.add(s.charAt(i));
            max1=Math.max(max1,i-left+1);
        }
        return max1;
    }
}