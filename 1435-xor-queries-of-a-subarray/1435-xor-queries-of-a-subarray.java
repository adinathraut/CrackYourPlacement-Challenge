class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        int ans[]=new int[queries.length];
        int j=0;
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            pre[i]=pre[i-1]^arr[i];
        }
        for(int i=0;i<queries.length;i++)
        {
            int n=queries[i][0];
            int m=queries[i][1];
            if(n==0) ans[j]=pre[m];
            else
            {
                ans[j]=pre[m]^pre[n-1];
            }
            j++;
        }
        return ans;
    }
}
