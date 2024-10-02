class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[]=arr.clone();
        Arrays.sort(arr);
        //String s=Arrays.toString(arr);
        int ans[]=new int[arr.length];
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(hmap.containsKey(arr[i])) continue;
            hmap.put(arr[i],k);
            k++;
        }
        for(int i=0;i<temp.length;i++)
        {
            ans[i]=hmap.get(temp[i])+1;
        }
        return ans;
    }
}