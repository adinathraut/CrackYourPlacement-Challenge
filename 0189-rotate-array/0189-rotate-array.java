class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = nums.clone();

        for (int i = 0; i < n; i++) {
            int position = (i+k) % n;
            nums[position] = temp[i];
        }
    }
}