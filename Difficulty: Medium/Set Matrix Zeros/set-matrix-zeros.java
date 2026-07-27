class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        int r=mat.length;
        int c=mat[0].length;
        
        int row[]=new int[r];
        int col[]=new int[c];
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                    
                }
            }
            
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(row[i]==1 || col[j]==1){
                    mat[i][j]=0;
                }
            }
        }
    }
}