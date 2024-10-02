// import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        
        for (String word : words) {
            if (matchesPattern(word, pattern)) {
                ans.add(word);
            }
        }
        
        return ans;
    }
    
    private boolean matchesPattern(String word, String pattern) {
        if (word.length() != pattern.length()) return false;
        
        // Map to store character mappings
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            
            // Check if the mapping exists and if it is consistent
            if (map1.containsKey(w) && map1.get(w) != p) {
                return false;
            }
            if (map2.containsKey(p) && map2.get(p) != w) {
                return false;
            }
            
            // Add the mapping
            map1.put(w, p);
            map2.put(p, w);
        }
        
        return true;
    }
}
