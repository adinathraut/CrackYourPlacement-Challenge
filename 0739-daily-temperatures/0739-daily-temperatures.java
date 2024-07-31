class Solution {
    public int[] dailyTemperatures(int[] t) {
        // ArrayList<Integer> arr=new ArrayList<>();
        // int count=0;
        // int flag=0;
        // for(int i=0;i<t.length;i++)
        // {
        //      for(int j=i+1;j<t.length;j++)
        //              {
        //          if(t[j]<=t[i])
        //          {
        //              count++; 
        //          }
        //          else
        //          {
        //              flag=1;
        //              arr.add(count+1);
        //              count=0;
        //              break;
        //          }
        //      }
           
        // }
        // // int len=t.length;
        // // int l=arr.size();
        // // int dif=len-l;
        // // for(int i=0;i<dif;i++)
        // // {
        // //     arr.add(0);
        // // }
        // int res[]=new int[t.length];
        // for(int i=0;i<arr.size();i++)
        // {
        //     res[i]=arr.get(i);
        // }

   
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[t.length];

        for (int i = 0; i < t.length; i++) {
            while (!stack.isEmpty() && t[i] > t[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result;        
    }
}