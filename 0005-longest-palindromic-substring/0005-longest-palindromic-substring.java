class Solution {
    public boolean check(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if (s.length()<=1) return s;
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                String news=s.substring(i,j+1);
                //System.out.println(news);
                if(check(news)&&(news.length()>ans.length()))
                {
                    // if
                    // {
                        ans=news;
                    // }
                }
            }
        }
             if(ans==""&&s.length()>1) return s.substring(0,1);

        return ans;
    }
}

//TLE


// class Solution {
//     public boolean isPalindrome(String t)
//     {
//         int left=0;
//         int right=t.length()-1;
//         while(left<=right)
//         {
//             if(t.charAt(left)!=t.charAt(right))
//             {return false;}
//             left++;
//             right--;
//         }

//         return true;
//     }
//     public String longestPalindrome(String s) {
//         if(s.length()==1) return s;
//         int max=0;
//         String ans="";
//         for(int i=0;i<s.length();i++)
//         {
//             for(int j=i+1;j<s.length();j++)
//             {
//                 boolean res=isPalindrome(s.substring(i,j+1));
//                 //System.out.print(res);
//                 if(res && (j - i + 1) > max)
//                 {
//                    max = j - i + 1;
//                     ans = s.substring(i, j + 1);
//                     //System.out.print(i+" "+j);
//                    // System.out.print(ans);

//                 }
//             }
//         }
//         if(ans==""&&s.length()>1) return s.substring(0,1);
//         return ans;
//     }
// }