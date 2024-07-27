class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // transpose the matrix
       for(int i=0; i< n;i++){

            for(int j=0; j<i; j++){

               swap(matrix,i,j);
            }
        }


        ///reverse rows
        for(int i=0; i<n;i++){

           reverse(matrix[i],n);
        }

    }

    private void swap(int[][] matrix,int i, int j){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
    }

    private void reverse(int[] row,int n){

        for(int i=0; i<n/2;i++){
            int temp = row[i];
            row[i] = row[n-i-1];
            row[n-i-1] = temp;
        }
    }


}