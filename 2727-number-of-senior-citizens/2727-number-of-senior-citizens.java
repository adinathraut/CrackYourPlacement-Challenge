class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(String s:details)
        {
            String k=s.substring(11,13);
            System.out.println(k);
            if(Integer.parseInt(k)>60) c++;
        }
        return c;
    }
}