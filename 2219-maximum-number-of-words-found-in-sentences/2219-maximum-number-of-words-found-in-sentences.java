class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        int mx=Integer.MIN_VALUE;
        for(String i: sentences)
        {
            for(int j=0;j<i.length();j++)
            {
                if(i.charAt(j)==' ')
                {
                    c++;
                }
            }
            mx=Math.max(c,mx);
            c=0;

        }
        return mx+1;
    }
}