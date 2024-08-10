class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int dist=0;
        for(int i:nums)
        {
            if(Math.abs(i)<min)
            {
                min=Math.abs(i);
                dist=i;
            }
            else if(min==Math.abs(i))
            {
                if(dist<i)
                {
                    dist=i;
                }
            }
        }
        return dist;
    }
}