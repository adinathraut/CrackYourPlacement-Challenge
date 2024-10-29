class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hset=new HashSet<>();
        for(int i:candyType)
        {
            hset.add(i);
        }
        int n=candyType.length/2;
        if(hset.size()>n) return n;
        return hset.size();
    }
}