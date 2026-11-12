class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cols= matrix[0].length;
        int rows= matrix.length;

        int left=0;
        int right= rows*cols-1;

        while(left<=right){
            int mid= (left+right)/2;
            int row= mid/cols;
            int col= mid%cols;

            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                left=mid+1;
            }else if(matrix[row][col]>target){
                right=mid-1;
            }
        }
        return false;
    }
}
