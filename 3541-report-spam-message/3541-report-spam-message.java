class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int c=0;
        Set<String> hset=new HashSet<>();
        for(String s:bannedWords)
        {
            hset.add(s);
        }
        for(String k:message)
        {
            if(hset.contains(k))
            {
                c++;
            }
            if(c>=2) return true;
        }
                    if(c>=2) return true;
return false;
    }
}