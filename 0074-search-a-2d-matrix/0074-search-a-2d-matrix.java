class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int lb = 0;
        int up = matrix[0].length-1;

        while(lb < matrix.length && up>=0){
            if(matrix[lb][up] == target){
                return true;
            }
            if(matrix[lb][up]<target){
                lb++;
            }
            else{
                up--;
            }
        }
        return false;
        
    }
}