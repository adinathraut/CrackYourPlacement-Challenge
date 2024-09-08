class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       // Arrays.sort(candies);

        int len=candies.length;
        int gre=Integer.MIN_VALUE;
        for(int i:candies)
        {
            gre=Math.max(gre,i);
        }
        ArrayList<Boolean> arr=new ArrayList<>();
        for(int i:candies)
        {
            if(i+extraCandies>=gre) arr.add(true);
            else
            arr.add(false);
        }
        return arr;
    }
}