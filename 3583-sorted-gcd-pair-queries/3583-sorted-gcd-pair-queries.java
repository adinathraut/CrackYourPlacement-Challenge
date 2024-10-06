class Solution {
   public int[] gcdValues(int[] inputArray, long[] queryArray) {
    int arraySize = inputArray.length;
    final int MAX_LIMIT = 5 * 10000;
    int[] frequencyArray = new int[MAX_LIMIT + 1];
    long[] pairCountArray = new long[MAX_LIMIT + 1];
    
    for (int value : inputArray) {
        frequencyArray[value]++;
    }
    
    for (int currentGcd = MAX_LIMIT; currentGcd >= 1; currentGcd--) {
        long totalCount = 0;
        for (int multiple = currentGcd; multiple <= MAX_LIMIT; multiple += currentGcd) {
            totalCount += frequencyArray[multiple];
        }
        pairCountArray[currentGcd] = totalCount * (totalCount - 1) / 2;
        for (int higherMultiple = 2 * currentGcd; higherMultiple <= MAX_LIMIT; higherMultiple += currentGcd) {
            pairCountArray[currentGcd] -= pairCountArray[higherMultiple];
        }
    }
    
    long[] cumulativeSumArray = new long[MAX_LIMIT + 1];
    for (int i = 1; i <= MAX_LIMIT; i++) {
        cumulativeSumArray[i] = cumulativeSumArray[i - 1] + pairCountArray[i];
    }
    
    int[] resultArray = new int[queryArray.length];
    for (int i = 0; i < queryArray.length; i++) {
        long query = queryArray[i];
        int left = 1, right = MAX_LIMIT;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (cumulativeSumArray[mid] >= query + 1) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        resultArray[i] = left;
    }
    
    return resultArray;
}

}