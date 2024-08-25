class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        HashSet<Integer> hset=new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);
        }
        int c=0;
        for(int k:hmap.values())//aabbcc

        {
            while(k>0 && hset.contains(k))
            {
                k--;
                c++;
            }
            hset.add(k);
        }
        return c;
    }
}