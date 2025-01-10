class Solution {
    public int countPoints(String rings) {
        HashMap<Character,HashSet<Character>> map = new HashMap<>();
        for(int i=rings.length()-1; i>=1; i--) {
            char ch = rings.charAt(i);
            char c = rings.charAt(i-1);
            if(ch >= '0' && ch <= '9') {
                if(map.containsKey(ch)) {
                    map.get(ch).add(c);
                } else {
                    HashSet<Character> set = new HashSet<>();
                    set.add(c);
                    map.put(ch,set);
                }
            }            
        }
        // System.out.println(map);
        int count = 0;
        for(HashSet<Character> set : map.values()) {
            if(set.size() == 3) {
                count++;
            }
        }
        return count;
    }
}