class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length==1)return 0;
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        if(min==max)return 0;
        int avg=nums[nums.length / 2];;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=Math.abs(nums[i]-avg);
        }
        return sum;
    }
}