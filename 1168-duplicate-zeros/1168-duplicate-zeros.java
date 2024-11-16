class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
    int n = arr.length;

    // Count zeros in the array
    for (int i = 0; i < n; i++) {
        if (arr[i] == 0) {
            zeros++;
        }
    }

    // Traverse the array backward, and place elements in their new positions
    for (int i = n - 1; i >= 0; i--) {
        // Check if the element can fit in the array after duplication
        if (i + zeros < n) {
            arr[i + zeros] = arr[i];
        }

        // Duplicate zero if the element is zero
        if (arr[i] == 0) {
            zeros--;  // One zero handled, reduce the count
            if (i + zeros < n) {
                arr[i + zeros] = 0;  // Place an extra zero
            }
        }
    }
}
}