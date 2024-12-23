class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int i=1;
        double sum=0;
        for(i=1;i<salary.length-1;i++)
        {
            sum+=salary[i];
        }
        return (double)sum/(i-1);
    }
}