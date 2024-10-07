class Solution {
    public int minLength(String s) {
        int ans=0;
        //System.out.println();
        while(s.contains("AB")||s.contains("CD"))
       { s=s.replaceAll("AB","");
        
        s=s.replaceAll("CD","");}
        return s.length();
    }
}