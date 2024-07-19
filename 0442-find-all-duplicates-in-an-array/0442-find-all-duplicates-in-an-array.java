class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);

        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int k:hmap.keySet())
        {
            if(hmap.get(k)>=2)
            {
                ans.add(k);
            }
        }
        return ans;
    }
}