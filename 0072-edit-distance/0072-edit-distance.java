class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0){
                    dp[i][j]=j;
                }
                else if(j==0){
                    dp[i][j]=i;
                }
                else if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int insert=dp[i-1][j];
                    int delete=dp[i][j-1];
                    int replace=dp[i-1][j-1];
                    dp[i][j]=1+Math.min(insert,Math.min(delete,replace));
                }
            }
            
        }
        return dp[m][n];





        // for(int[] arr:dp){
        //     Arrays.fill(arr,-1);
        // }
        // return editDistance(word1,word2,0,0,dp);
    }
    // public int editDistance(String s1,String s2,int i,int j,int[][]dp){
    //     int m=s1.length();
    //     int n=s2.length();
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     if(i==m){
    //         return n-j;
    //     }
    //     else if(j==n){
    //         return m-i;
    //     }
    //     if(s1.charAt(i)==s2.charAt(j)){
    //         return dp[i][j]=editDistance(s1,s2,i+1,j+1,dp);
    //     }
    //     else{
    //         int insert=1+editDistance(s1,s2,i,j+1,dp);
    //         int delete=1+editDistance(s1,s2,i+1,j,dp);
    //         int replace=1+editDistance(s1,s2,i+1,j+1,dp);
    //         return dp[i][j]=Math.min(insert,Math.min(delete,replace));
    //     }
    // }
}