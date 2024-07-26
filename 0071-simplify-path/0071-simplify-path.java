class Solution {
    public String simplifyPath(String path) {
        // String ans="/";
        // for(int i=1;i<path.length()-3;i++)
        // {
        // if(path.charAt(i)=='/'&& path.charAt(i+1)) continue;
        // if(path.charAt(i)=='.' && path.charAt(i+1)=='.'&& path.charAt(i+2)=='/')
        // ans-=str.charAt(i-1);
        // ans+=str.charAt(i);
        // }
        String[] str = path.split("/");
        Stack<String> st = new Stack<>();
        for (String s : str) {
            if (s.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (!s.equals(".") && !s.equals("")) {
                st.push(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : st) {
            sb.append("/").append(s);
        }
        return sb.length() > 0 ? sb.toString() : "/";

    }
}