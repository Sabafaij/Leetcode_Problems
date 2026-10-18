class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m=mat.length-1;
        int n=mat[0].length-1;
        int low=0;
        int high=m;
        int row=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mat[mid][n]>target){
                row=mid;
                high=mid-1;
            }
            else if(mat[mid][n]<target){
                low=mid+1;
            }
            else{
                return true;
            }
        }
        low=0;
        high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mat[row][mid]==target){
                return true;
            }
            else if(mat[row][mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}