class Solution {
    public int longestValidParentheses(String s) {
        Stack<Pair<Character,Integer>> st=new Stack<>();
        int max=0,count=0,n=s.length();
        char[] ch=s.toCharArray();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(!(st.isEmpty()) && ch[i]==')' && st.peek().getKey()=='(') arr[i]=arr[st.pop().getValue()]=1;
            else st.push(new Pair<>(ch[i],i));
        }
        for(int i=0;i<n;i++){
            if(arr[i]==1) count++;
            else count=0;
            max=Math.max(count,max);
        }
        return max;
    }
}