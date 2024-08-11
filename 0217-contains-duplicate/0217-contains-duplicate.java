class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

    for (final int num : nums)
      seen.add(num);
      
    if(seen.size()==nums.length)
    return false;
        return true;
    }
}