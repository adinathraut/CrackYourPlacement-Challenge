class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                int c = b + 1;
                int d = n - 1;
                while (c < d) {
                    long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum < target) {
                        c++;
                    } else if (sum > target) {
                        d--;
                    } else {
                        List<Integer> quad = Arrays.asList(nums[a], nums[b], nums[c], nums[d]);
                        // Check if this quad is already in the list
                        if (!ans.contains(quad)) {
                            ans.add(quad);
                        }
                        c++;
                        d--;
                    }
                }
            }
        }
        return ans;
    }
}