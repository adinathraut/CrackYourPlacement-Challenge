class Solution {
    public int takeCharacters(String s, int k) {
        char[] freq=new char[3];
        int N=s.length();
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        if(k==0)return 0;
        if(freq[0]<k || freq[1]<k ||freq[2]<k )return -1;
        int right=0;
        int ans=999999;
        for(int i=0;i<N;i++){
           while(right<N && freq[0]>=k && freq[1]>=k &&freq[2]>=k ){
                if(freq[s.charAt(right)-'a']-1>=k){
                    freq[s.charAt(right)-'a']--;
                    right++;
                }else break;
           }
           System.out.println(i+" "+right);
            ans=Math.min(ans, N-right+i);
            freq[s.charAt(i)-'a']++;
        }
        return ans;
    }
}