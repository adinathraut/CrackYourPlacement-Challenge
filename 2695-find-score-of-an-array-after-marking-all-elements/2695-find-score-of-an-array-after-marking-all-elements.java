class Solution {
   public long findScore(int[] nums) {
        // Sort the indices based on their values in nums
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            indices.add(i);
        }

        indices.sort((a, b) -> Integer.compare(nums[a], nums[b]));

        long score = 0;
        Set<Integer> visited = new HashSet<>();

        for (int idx : indices) {
            if (!visited.contains(idx)) {
                score += nums[idx];
                visited.add(idx);
                if (idx > 0) visited.add(idx - 1); // Mark left neighbor as visited
                if (idx < nums.length - 1) visited.add(idx + 1); // Mark right neighbor as visited
            }
        }

        return score;
    }
}