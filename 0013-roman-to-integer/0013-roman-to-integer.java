 class Solution {
    public int romanToInt(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='I'){
                if(i+1<s.length() && s.charAt(i+1)=='V'){
                    count+=4;i++;}
                else if(i+1<s.length() && s.charAt(i+1)=='X'){
                    count+=9;i++;}
                else
                    count+=1;
            }
            else if(x=='X'){
                if(i+1<s.length() && s.charAt(i+1)=='L'){
                    count+=40;i++;}
                else if(i+1<s.length() && s.charAt(i+1)=='C'){
                    count+=90;i++;}
                else
                    count+=10;
            }
            else if(x=='C'){
                if(i+1<s.length() && s.charAt(i+1)=='D'){
                    count+=400;i++;}
                else if(i+1<s.length() && s.charAt(i+1)=='M'){
                    count+=900;i++;}
                else
                    count+=100;
            }
            else if(x=='V')
                count+=5;
            else if(x=='L')
                count+=50;
            else if(x=='D')
                count+=500;
            else if(x=='M')
                count+=1000;
        }
        return count;
    }
}