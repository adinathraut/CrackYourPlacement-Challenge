class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,ans=0,maxfreq=0;
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(int right=0;right<s.length();right++)
        {
            char charright=s.charAt(right);
            hmap.put(charright,hmap.getOrDefault(charright,0)+1);
            maxfreq=Math.max(hmap.get(charright),maxfreq);
            // int currlen=right-left+1;
            // int diff=currlen-maxfreq;
            while((right-left+1)-maxfreq>k)
            {
                char leftchar=s.charAt(left);
                hmap.put(leftchar,hmap.get(leftchar)-1);
                left++;
            }
            ans=Math.max(right-left+1,ans);
        }
        return ans;
    }
}