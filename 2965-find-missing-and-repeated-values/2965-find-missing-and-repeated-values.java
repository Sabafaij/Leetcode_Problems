class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        boolean[] check=new boolean[n*n+1];
        int[] arr=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(check[grid[i][j]]){
                    arr[0]=grid[i][j];
                    
                }
                check[grid[i][j]]=true;
            }
        }
        for(int i=1;i<check.length;i++){
            if(check[i]==false){
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}