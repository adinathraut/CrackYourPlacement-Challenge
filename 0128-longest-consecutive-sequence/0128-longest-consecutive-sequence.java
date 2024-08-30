class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
                if(nums.length==1) return 1;

        Arrays.sort(nums);
        int left=0;
        int right=0;//0 0 1 2 3 4 5 6 7 8
        //1 2 3 4 100 200
        int max=Integer.MIN_VALUE;
        int c=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]==(nums[i]+1))
            {
             //   right++;
                c++;
            }
            else if(nums[i+1]==nums[i])
            {continue;}
            else
            {
                //int curr=(right-left)+1;
                max=Math.max(c,max);//1
                c=1;
                //left=right+1;
            }
        }
        return Math.max(max,c);
    }
}