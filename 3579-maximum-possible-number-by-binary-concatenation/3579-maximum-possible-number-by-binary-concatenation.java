class Solution {
    public int maxGoodNumber(int[] nums) {
        int maxValue = 0;

        // Sort the array
        Arrays.sort(nums);
        
        // Generate all permutations of the sorted array
        do {
            // Create the concatenated binary string
            StringBuilder concatenatedBinary = new StringBuilder();
            for (int num : nums) {
                // Convert each number to its binary representation and remove leading zeros
                concatenatedBinary.append(Integer.toBinaryString(num));
            }
            
            // Convert the binary string to a decimal value
            int decimalValue = Integer.parseInt(concatenatedBinary.toString(), 2);
            
            // Update the maximum value
            maxValue = Math.max(maxValue, decimalValue);

        } while (nextPermutation(nums));

        return maxValue;
    }

    // Helper function to generate the next permutation (like C++'s next_permutation)
    private boolean nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        if (i == -1) return false;

        int j = nums.length - 1;
        while (nums[j] <= nums[i]) j--;
        
        // Swap nums[i] and nums[j]
        swap(nums, i, j);
        
        // Reverse the elements after index i
        reverse(nums, i + 1, nums.length - 1);
        
        return true;
    }

    // Swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse elements in the array from index start to end
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}