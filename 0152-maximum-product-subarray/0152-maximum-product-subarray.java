class Solution {
    public int maxProduct(int[] nums) {
        // int pro=Integer.MIN_VALUE;
        // int pref=1;
        // int suff=1;
        // int n=nums.length;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(suff==0) suff=1;
        //     if(pref==0) pref=1;
        //     suff*=nums[i];
        //     pref*=nums[n-i-1];
        //     pro=Math.max(pro,Math.max(suff,pref));
        //    // int cur=proe*nums[i];
        // }
        // return pro;
        int pro=1;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {  
            pro*=nums[i];
            mx=Math.max(mx,pro);
          if(pro==0) pro=1;
        }
            pro=1;
        for(int i=nums.length-1;i>=0;i--)
        {  
            pro*=nums[i];
            mx=Math.max(mx,pro);
          if(pro==0) pro=1;
        }
        return mx;
    }
}