class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int d=nums.length/3;
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i:nums)
        {
            hmap.put(i,hmap.getOrDefault(i,0)+1);

        }
         //Collections.sort(hmap,(a,b)->hmap.get(b)hmap.get(a));
       //  Collections.sort(hmap,(a,b)->Integer.compare(hmap.get(b),hmap.get(a)));
        List<Integer> arr=new ArrayList<>();
        for(int k:hmap.keySet())
        {
            if(hmap.get(k)>d) 
            arr.add(k);
        }
        return arr;
    }
}