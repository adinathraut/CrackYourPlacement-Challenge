class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:stones)
        {
            pq.offer(i);
        }
     //   System.out.println(pq.toString());
               
        while(pq.size()>1)
        {
            int f=pq.poll();
             //System.out.println(f);

            int s=pq.poll();
            int sum=f-s;
            pq.offer(sum);

        }
        return pq.peek();
    }
}