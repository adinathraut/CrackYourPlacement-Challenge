class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        // int sum[]=new int[2];
        // //Arrays.sort(nums);
        // for(int i=0; i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //     if(nums[i]+nums[j]==target)
        //     {
        //         sum[0]=i;
        //         sum[1]=j;
        //         return sum;
        //     }
        //     }
        // }
        // return sum;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(target-nums[i]))
            {
                return new int[]{hmap.get(target-nums[i]),i};
            }
            hmap.put(nums[i],i);
        }
        return new int[]{};
    }
}