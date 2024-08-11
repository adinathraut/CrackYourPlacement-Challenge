class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> st=new HashSet<>();
        for(char c:jewels.toCharArray())
        {
            st.add(c);
        }
        int ch=0;
        for(char c:stones.toCharArray())
        {
            if(st.contains(c))
            {
                ch++;
            }
        }
        return ch;
    }
}