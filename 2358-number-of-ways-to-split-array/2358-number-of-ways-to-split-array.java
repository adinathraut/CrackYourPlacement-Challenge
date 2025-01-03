// class Solution {
//     public int waysToSplitArray(int[] nums) {
//         int n=nums.length;
//         int pre[]=new int[n];
//         int post[]=new int[n];
//         pre[0]=nums[0];
//         post[n-1]=nums[n-1];
//         for(int i=1;i<n;i++)
//         {
//             pre[i]=pre[i-1]+nums[i];
//         }
//         for(int i=n-2;i>=0;i--)
//         {
//             post[i]=post[i+1]+nums[i];
//         }

//        System.out.println(Arrays.toString(pre));
//        System.out.println(Arrays.toString(post));
//        int ans=0;
//        //int j=1;
//        for(int i=0;i<n-1;i++)
//        {
//         if(pre[i]>=post[i+1]) ans++;
//         //j++;
//        }
//         return ans;
//     }
// }
class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long prefixSum = 0;
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            prefixSum += nums[i];
            if (prefixSum >= totalSum - prefixSum) ans++;
        }

        return ans;
    }
}
