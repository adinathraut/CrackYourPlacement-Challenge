class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int c=0;
        for(int i:nums)
        {
            if(i==0) c++;
            mul*=i;
        }
        int ans[]=new int[nums.length];
        if(c>1) return ans;
        if(c==1)
        {
           // Arrays.sort(nums);
            int nmul=1;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0) continue;
                nmul*=nums[i];
            }
            System.out.println(nmul);
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                {
                    ans[i]=nmul;
                }
                else
                {
                    ans[i]=0;
                }
            }
            return ans;
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                    ans[i]=mul/nums[i];
                
            }
        }
        return ans;
    }
}