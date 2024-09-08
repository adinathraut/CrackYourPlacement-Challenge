class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[]=new int[nums.length];
        int temp[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hmap.containsKey(nums[i]))
            hmap.put(nums[i],i);
            else continue;
        }
        int k=0;
        for(int i:temp)
        {
            ans[k]=hmap.get(i);
            k++;
        }
        return ans;

    }
}