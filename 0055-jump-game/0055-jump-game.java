class Solution {
    public boolean canJump(int[] nums) {
        //if(nums.length==1) return true;
        int g=nums.length-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]+i>=g)
            {
                g=i;
            }
        }
        if(g==0) return true;
        return false;
    }
}