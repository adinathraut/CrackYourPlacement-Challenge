
class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
         Set<Integer> suspiciousMethods = new HashSet<>();
        suspiciousMethods.add(k);
        boolean changed = true;

        // Keep marking suspicious methods while changes are happening
        while (changed) {
            changed = false;
            for (int[] invocation : invocations) {
                int a = invocation[0]; // Method a invokes method b
                int b = invocation[1];
                if (suspiciousMethods.contains(a) && !suspiciousMethods.contains(b)) {
                    suspiciousMethods.add(b);
                    changed = true; // A new method was marked as suspicious, so we continue
                }
            }
        }

        // Step 2: Check if any method outside suspicious methods invokes a suspicious method
        for (int[] invocation : invocations) {
            int a = invocation[0];
            int b = invocation[1];
            if (!suspiciousMethods.contains(a) && suspiciousMethods.contains(b)) {
                // If an external method invokes a suspicious method, we can't remove anything
                return Arrays.asList(createArray(n));
            }
        }

        // Step 3: Return remaining methods
        List<Integer> remainingMethods = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspiciousMethods.contains(i)) {
                remainingMethods.add(i);
            }
        }
        
        return remainingMethods;
    }

    // Helper function to create an array of methods from 0 to n-1
    private static Integer[] createArray(int n) {
        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }
}