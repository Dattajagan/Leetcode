class Solution {
    public void setZeroes(int[][] matrix) {
        // List<Integer> I= new ArrayList<>();
        // List<Integer> J= new ArrayList<>();
        int [] col= new int[matrix[0].length];
        int[] row = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    col[j]=1;
                    row[i]=1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;

                }
            }
        }
    }
}