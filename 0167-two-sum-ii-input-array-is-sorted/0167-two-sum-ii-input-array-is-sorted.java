class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int index[]=new int[2];
        while(left<right)
        {
            if(nums[left]+nums[right]==target)
            {
                index[0]=left+1;
                index[1]=right+1;
                return new int[]{left+1,right+1};
            }
            if(nums[left]+nums[right]>target){right--;}
            else {left++;}
        }
        return index;
    }
}