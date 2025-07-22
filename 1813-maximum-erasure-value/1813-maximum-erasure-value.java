class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> hset=new HashSet<>();
        int left=0,curr=0,maxi=0;
        for(int ri=0;ri<nums.length;ri++)
        {
            while(hset.contains(nums[ri]))
            {
                hset.remove(nums[left]);
                curr-=nums[left];
                left++;
            }
            hset.add(nums[ri]);
            curr+=nums[ri];
            maxi=Math.max(maxi,curr);
        }
        return maxi;
    }
}