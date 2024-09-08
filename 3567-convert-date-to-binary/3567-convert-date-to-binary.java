class Solution {
    public String convertDateToBinary(String date) {
        String arr[]=date.split("-");
        String ans="";
        for(String c:arr)
        {
            ans+=Integer.toBinaryString(Integer.parseInt(c));
            ans+="-";
        }
        return ans.substring(0,ans.length()-1);
    }
}