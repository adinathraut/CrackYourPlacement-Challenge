class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int k=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                {
                    k++;
                }
            }
            a[i]=k;
        }
        return a;
    }
}