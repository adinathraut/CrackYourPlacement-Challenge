class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        //Collections.sort(list,(a, b) -> map.get(b) - map.get(a));
        for(int ki:map.keySet())
        {
            pq.add(ki);
        }
        int res[] = new int[k];
        for (int i = 0; i < k; ++i)
            res[i] = pq.poll();
        return res;
    }
}