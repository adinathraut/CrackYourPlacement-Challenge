class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> hset=new HashSet<>();
      //  int c=1;
        int mc=1;
        for(int i=0;i<nums.length;i++)
        {
            hset.add(nums[i]);
        }
        for(int i:hset)
        {
            if(hset.contains(i-1)) continue;
            else
            {
                int next=i;
                int c=1;
                while(hset.contains(next+1))
                {
                    c++;
                    next++;
                }
                mc=Math.max(c,mc);
            }
            
        }
        return mc;
    }
}