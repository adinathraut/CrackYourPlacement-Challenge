class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[n*2];
        int j=0;
        for(int i=0;i<ans.length;i+=2)
        {
            ans[i]=nums[j];
            j++;
        }
        for(int i=1;i<ans.length;i+=2)
        {
            ans[i]=nums[j];
            j++;
        }
        return ans;

    }
}