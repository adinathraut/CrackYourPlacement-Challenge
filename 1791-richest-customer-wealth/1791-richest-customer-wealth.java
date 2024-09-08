class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        int row=accounts.length;
        int col=accounts[0].length;
        for(int i=0;i<row;i++)
        {
            int curr=0;
            for(int j=0;j<col;j++)
            {
                curr+=accounts[i][j];
            }
            max=Math.max(curr,max);
        }
        return max;
    }
}