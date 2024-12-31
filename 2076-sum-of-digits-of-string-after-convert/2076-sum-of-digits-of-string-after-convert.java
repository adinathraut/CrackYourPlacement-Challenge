// class Solution {
//     public int getLucky(String s, int k) {
//         int ans=0;
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<s.length();i++)
//         {
//             //System.out.println(s.charAt(i)-'a');
//             sb.append(s.charAt(i)-'a'+1);
//         }
//         String a=String.valueOf(sb);
//         System.out.println(a);
//         for(int i=0;i<a.length();i++)
//         {
//             ans+=Integer.parseInt(String.valueOf(a.charAt(i)));
//         }
//         return ans;
//     }
// }
class Solution {
    public int getLucky(String s, int k) {
        // Convert each character in the string to its corresponding numeric value
        StringBuilder number = new StringBuilder();
        for (char x : s.toCharArray()) {
            number.append(x - 'a' + 1);
        }
        
        // Perform the transformation `k` times
        while (k > 0) {
            int temp = 0;
            for (char x : number.toString().toCharArray()) {
                temp += x - '0';  // Sum the digits of the current number
            }
            number = new StringBuilder(String.valueOf(temp));  // Convert the sum back to a string
            k--;
        }
        return Integer.parseInt(number.toString());  // Return the final result as an integer
    }
}