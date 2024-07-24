class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb=new StringBuilder();
        while(col>0)
        {
            col--;
            int digit=col%26;
            sb.append((char) (digit + 'A'));
            col=col/26;
        }
        return sb.reverse().toString();
    }
}