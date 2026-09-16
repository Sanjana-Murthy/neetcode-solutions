class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length - 1;
        int m = matrix.length, n = matrix[0].length;
        
        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] > target){
                c -= 1;
            }
            else if(matrix[r][c] < target){
                r += 1;
            }
        }
        return false;
    }
}
