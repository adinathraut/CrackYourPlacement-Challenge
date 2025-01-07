class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> l=new ArrayList<>();
        for(String s: words)
        {
            for(String s2: words)
            {
                if(!s.equals(s2) && !l.contains(s) && s2.contains(s))
                {
                    l.add(s);
                }
            }
        }
        return l;
    }
}