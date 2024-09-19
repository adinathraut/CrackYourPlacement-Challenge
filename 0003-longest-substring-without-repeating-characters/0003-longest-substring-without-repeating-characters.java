class Solution {
    public int helper(String s)
    {
        HashSet<Character> hset=new HashSet<>();
        int ch=0;
        for(char c:s.toCharArray())
        {
            if(!hset.contains(c))
            {
                hset.add(c);
            }
            else
            {
                return hset.size();
            }
        }
        return hset.size();
    }
    public int lengthOfLongestSubstring(String s) {
        int max=Integer.MIN_VALUE;
        int len=s.length();
        if(len==0) return 0;
        for(int i=0;i<s.length();i++)
        {
            int len1=helper(s.substring(i,len));
            max=Math.max(len1,max);
        }
        return max;
    }
}