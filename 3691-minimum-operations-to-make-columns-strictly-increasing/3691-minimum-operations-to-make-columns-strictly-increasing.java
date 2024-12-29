class Solution {
    public int minimumOperations(int[][] grid) {
        // 9
        // 32323434
        // 11
        // 43
        // 54
        // 6 
        int ans=0;
        int r=grid.length;
        int c=grid[0].length;

        for(int i=1;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i-1][j]>=grid[i][j])
                {
                    ans+=grid[i-1][j]+1-grid[i][j];
                    grid[i][j]=grid[i-1][j]+1;
                }
            }
        }
        return ans;
    }
}