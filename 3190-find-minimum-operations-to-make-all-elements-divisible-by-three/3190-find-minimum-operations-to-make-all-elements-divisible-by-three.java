class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i: nums)
        {
            // if(i<3)
            // {
            //    c+=1;
            // }
            // else
            // {
                if(i%3!=0)
                c++;
            // }
        }
         System.out.println(8%3);
       return c;
    }
}