class Solution {
    public int[] sumZero(int n) {
        // 0-4+4-3+3
        // 4
        // 4-43-3
        int ans[]=new int[n];
        int k=n+3;
        if(n%2==0)
        {
            int i=0;
            while(i<n)
            {
                ans[i]=k;
                ans[i+1]=-k;
                k--;
                i+=2;
            }
        }
        else
        {
            ans[0]=0;
            int i=1;
            while(i<n){
                ans[i]=k;
                ans[i+1]=-k;
                k--;
                i+=2;
            }
        }
        return ans;
    }
}