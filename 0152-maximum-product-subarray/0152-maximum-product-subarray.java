class Solution {
    public int maxProduct(int[] nums) {
        int pro=Integer.MIN_VALUE;
        int pref=1;
        int suff=1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(suff==0) suff=1;
            if(pref==0) pref=1;
            suff*=nums[i];
            pref*=nums[n-i-1];
            pro=Math.max(pro,Math.max(suff,pref));

           // int cur=proe*nums[i];
        }
        return pro;
    }
}