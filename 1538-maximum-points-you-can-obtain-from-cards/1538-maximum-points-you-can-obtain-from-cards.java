class Solution {
    public int maxScore(int[] c, int k) {
        int left=0;
        int right=c.length-1;
        int sum1=0;
        int sum2=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            sum1+=c[i];
        }
        max=Math.max(max,sum1);
        for(int i=k-1;i>=0;i--)
        {
            sum1=sum1-c[i];
            sum2=sum2+c[right];
            right--;
            max=Math.max(max,sum1+sum2);
            
        }
        return max;
    }
}