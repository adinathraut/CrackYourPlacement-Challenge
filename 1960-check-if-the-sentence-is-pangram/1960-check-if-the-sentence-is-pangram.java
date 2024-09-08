class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence=sentence.toLowerCase();
        int map[]=new int[26];
        for(char c:sentence.toCharArray())
        {
            map[c-'a']++;
        }
        for(int i:map)
        {
            if(i<=0) return false;
        }
        return true;
    }
}