class Solution {
    public void gameOfLife(int[][] board) {
        int n=board[0].length;
        int m=board.length;
        int[][] arr=new int[m][n];
        for (int i = 0; i < m; i++) {
            arr[i] = board[i].clone();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int life=0;
                if(i>0)
                    if(arr[i-1][j]==1) life++;
                    
                if(i>0 && j<n-1 )
                    if(arr[i-1][j+1]==1) life++;
                   
                if(j<n-1)
                    if( arr[i][j+1]==1) life++;
                    
                if(i<m-1 && j< n-1)
                    if( arr[i+1][j+1]==1) life++;
                   
                if(i<m-1)
                    if(  arr[i+1][j]==1) life++;
                   
                if(i<m-1 && j>0 )
                    if( arr[i+1][j-1]==1) life++;
                    
                if(j>0)
                    if( arr[i][j-1]==1) life++;
                    
                if(i>0 && j>0)
                    if( arr[i-1][j-1]==1) life++;
                   
                if(arr[i][j]==1){
                    if(life<2 || life>3){
                        board[i][j]=0;
                    }
                }
                else{
                    if(life==3){
                        board[i][j]=1;
                    }
                }
            }
        }
    }
}