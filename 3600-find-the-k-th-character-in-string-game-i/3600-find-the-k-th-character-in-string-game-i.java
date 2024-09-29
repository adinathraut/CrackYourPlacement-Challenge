class Solution {
    public char kthCharacter(int k) {
     String ans="a";
     while(ans.length()<=k)
     {
        String news="";
        for(char c:ans.toCharArray())
        {
            c++;
            news+=String.valueOf(c);
        }
        ans+=news; System.out.println(ans);

     }
    
     return ans.charAt(k-1);
    }
}