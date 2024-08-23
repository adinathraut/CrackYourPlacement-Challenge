class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res =-1111;
        int i=0;
        int j=0;
        double sum=0;
        while(j<=nums.length-1){
            sum+=nums[j];
            if(j-i+1==k){//5-1==4
                res=Math.max(res,(sum/k));
                sum-=nums[i++];
            }
            j++;
        }//[1,12,-5,-6,50,3]
        
        return res;
    }
}