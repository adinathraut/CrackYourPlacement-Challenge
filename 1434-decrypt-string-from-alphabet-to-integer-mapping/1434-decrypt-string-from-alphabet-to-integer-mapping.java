class Solution {
    public String freqAlphabets(String s) {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            String no="";
            if(i+2<s.length() && s.charAt(i+2)=='#')
            {
                no=String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i+1));
                i+=2;
            }
            else{
                no=String.valueOf(s.charAt(i));
            }

            int m=Integer.parseInt(no)+96;
            ans+=(char)m;
            no="";

        }
        return ans;
    }
}