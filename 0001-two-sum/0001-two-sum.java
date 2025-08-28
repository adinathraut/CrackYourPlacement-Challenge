class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int comp=target-nums[i];
            if(hmap.containsKey(comp)){
                arr[0]=hmap.get(comp);
                arr[1]=i;
                return arr;
            }
            hmap.put(nums[i],i);
        }
        return arr;
    }
}