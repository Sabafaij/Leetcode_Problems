class Solution {
    int m,n;
    public int closedIsland(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j)==true){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    public boolean dfs(int[][] arr,int r,int c){
        if(r<0 || r==m ||  c<0 || c==n){
            return false;
        }
        if(arr[r][c]==1){
            return true;
        }
        arr[r][c]=1;
        boolean left=dfs(arr,r,c-1);
        boolean upper=dfs(arr,r-1,c);
        boolean right=dfs(arr,r,c+1);
        boolean down=dfs(arr,r+1,c);
        return left && right && upper && down;
    }
}