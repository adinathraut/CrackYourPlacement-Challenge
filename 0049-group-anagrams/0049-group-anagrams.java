class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap=new HashMap<>(); 
        for(String s:strs)
        {
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String str=String.valueOf(ch);
            if(hmap.containsKey(str))
            {
                List<String> l=hmap.get(str);
                l.add(s);
                hmap.put(str,l);
            }
            else
            {
                List<String> l=new ArrayList<>();
                l.add(s);
                hmap.put(str,l);
            }
        }

         return new ArrayList<>(hmap.values());
        // List<List<String>> ans = new ArrayList<>();
        // for(Map.Entry<String, List<String>> entry : hmap.entrySet()){
        //     ans.add(entry.getValue());
        // }
        // return ans;
    }
}