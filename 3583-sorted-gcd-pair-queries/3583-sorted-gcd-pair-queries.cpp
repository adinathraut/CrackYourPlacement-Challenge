class Solution {
public:
    vector<int> gcdValues(vector<int>& nums, vector<long long>& queries) {
    int size = nums.size();  // Use 'nums' instead of 'numbers'
    const int MAX_VALUE = 5 * 10000;
    vector<int> frequencyCount(MAX_VALUE + 1, 0);
    vector<long long> gcdPairCount(MAX_VALUE + 1, 0);
    
    // Step 1: Count frequency of each number
    for (int number : nums) {  // Use 'nums' here
        frequencyCount[number]++;
    }
    
    // Step 2: Calculate GCD pair counts
    for (int currentGcd = MAX_VALUE; currentGcd >= 1; currentGcd--) {
        long long totalMultiples = 0;
        // Count the total multiples of currentGcd
        for (int multiple = currentGcd; multiple <= MAX_VALUE; multiple += currentGcd) {
            totalMultiples += frequencyCount[multiple];
        }
        gcdPairCount[currentGcd] = totalMultiples * (totalMultiples - 1) / 2; // nC2
        for (int higherMultiple = 2 * currentGcd; higherMultiple <= MAX_VALUE; higherMultiple += currentGcd) {
            gcdPairCount[currentGcd] -= gcdPairCount[higherMultiple]; // Subtract pairs counted in higher multiples
        }
    }
    
    // Step 3: Build the prefix sum for GCD pair counts
    vector<long long> cumulativeSum(MAX_VALUE + 1, 0);
    for (int i = 1; i <= MAX_VALUE; i++) {
        cumulativeSum[i] = cumulativeSum[i - 1] + gcdPairCount[i];
    }
    
    // Step 4: Prepare the answer for each query
    vector<int> results;
    for (long long query : queries) {
        int left = 1, right = MAX_VALUE;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (cumulativeSum[mid] >= query + 1) {
                right = mid; // mid is a candidate
            } else {
                left = mid + 1; // mid is too small
            }
        }
        results.push_back(left); // The answer for the current query
    }
    
    return results;
}

};