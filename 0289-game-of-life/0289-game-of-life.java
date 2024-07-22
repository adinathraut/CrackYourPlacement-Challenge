class Solution {
    public void gameOfLife(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int b[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j]=arr[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int count=0;
                if(j<m-1&&b[i][j+1]==1){
                    count++;
                }
                if(i<n-1&&b[i+1][j]==1){
                    count++;
                }
                if(j>0&&b[i][j-1]==1){
                    count++;
                }
                if(i>0&&b[i-1][j]==1){
                    count++;
                }
                if(i>0&&j>0&&b[i-1][j-1]==1){
                    count++;
                }
                if(j<m-1&&i<n-1&&b[i+1][j+1]==1){
                    count++;
                }
                if(i>0&&j<m-1&&b[i-1][j+1]==1){
                    count++;
                }
                if(j>0&&i<n-1&&b[i+1][j-1]==1){
                    count++;
                }
                if(b[i][j]==1){
                    if(count<2||count>3){
                        arr[i][j]=0;
                    }
                    else{
                        arr[i][j]=1;
                    }
                }
                else{
                    if(count==3){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }
        }
    }
}