class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(grid[0][0]==1 || grid[m-1][n-1]==1){
            return 0;
        }
        grid[0][0]=1;
        for(int i=1;i<m;i++){
            if(grid[i][0]==0){
                grid[i][0]=1;
            }
            else{
                while(i<m){
                    grid[i][0]=0;
                    i++;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(grid[0][i]==0){
                grid[0][i]=1;
            }
            else{
                while(i<n){
                    grid[0][i]=0;
                    i++;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(grid[i][j]==0){
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }
                else{
                    grid[i][j]=0;
                }
            }
        }
        return grid[m-1][n-1];
    }
}