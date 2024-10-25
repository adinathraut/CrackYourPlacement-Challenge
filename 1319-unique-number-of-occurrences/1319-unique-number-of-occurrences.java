class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i:arr)
        {
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        for(Map.Entry <Integer,Integer> e:hmap.entrySet())
        {
             int t = e.getValue();
            int x = e.getKey();
            hmap.put(x , -1);

            if(hmap.containsValue(t)){
                return false;
            }

            hmap.put(x , t);
        }
               return true;
    }
}