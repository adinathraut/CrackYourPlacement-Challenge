class Solution {
    public int[][] merge(int[][] arr) {
       
       int n = arr.length; // size of the array
        //sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) { // select an interval:
            int start = arr[i][0];
            int end = arr[i][1];

            //Skip all the merged intervals:
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            //check the rest of the intervals:
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }
        int row=ans.size();
        int col=2;
        int ans2[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
           List<Integer> c= ans.get(i);
           ans2[i][0]=c.get(0);
           ans2[i][1]=c.get(1);
        }
        return ans2;
    }
}