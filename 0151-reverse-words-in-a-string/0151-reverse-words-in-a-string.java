class Solution {
    public String reverseWords(String s) {
         // Trim leading and trailing spaces and split the string into words
        String[] words = s.trim().split("\\s+");

        // Reverse the array of words
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Join the reversed words into a single string with a space separator
        return String.join(" ", words);
    }
}