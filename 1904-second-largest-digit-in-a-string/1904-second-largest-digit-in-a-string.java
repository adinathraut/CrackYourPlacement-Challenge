class Solution {
    public int secondHighest(String s) {
        int large=Integer.MIN_VALUE;
        int sc=Integer.MIN_VALUE;
        int ch=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c))
            {
                int num=Integer.parseInt(Character.toString(c));
                if(num>large)
                {
                    ch++;
                    sc=large;
                    large=num;
                }
                if(num>sc && num<large)
                {ch++;
                    sc=num;
                }
            
            }
        }
        // System.out.println(sc);
        // System.out.println(large);
        if(ch==1 || ch==0) return -1;
        return sc;
    }
}