class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        boolean flag=true;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<=n-k;i++)
        {
            flag=true;
            for(int j=i;j<i+k;j++)
            {
                if(j<=n-2&& nums[j+1]!=nums[j]+1 && j+1<i+k ) {
                    arr.add(-1);
                    flag=false;
                    break;
                }
               
            }
            if(flag)
            {
                arr.add(nums[i+k-1]);
            }
        }
        System.out.println(arr.toString());
        int ans[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
    }
}