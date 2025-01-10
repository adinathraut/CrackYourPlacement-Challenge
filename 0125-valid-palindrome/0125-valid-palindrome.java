class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                sb.append(Character.toLowerCase(c));
            }
        }
        if(sb.toString().equals(sb.reverse().toString())) return true;
        // String rev=sb.reverse().toString();
        // if(sb.toString().equals(rev)) return true;
        return false;
    }
}