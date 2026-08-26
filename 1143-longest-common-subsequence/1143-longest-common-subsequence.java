// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         StringBuilder a=new StringBuilder(text1);
//         StringBuilder b=new StringBuilder(text2);
//         int m=a.length();
//         int n=b.length();
//         int[][] dp=new int [m][n];
//         for(int[] arr:dp){
//             Arrays.fill(arr,-1);
//         }
//         return lcs(m-1,n-1,a,b,dp);
//     }
//     private int lcs(int m,int n,StringBuilder a,StringBuilder b,int[][]dp){
//         if (m<0 || n<0){
//             return 0;
//         }
//         if(dp[m][n]!=-1) return dp[m][n];
//         if(a.charAt(m)==b.charAt(n)){
//             return dp[m][n]= 1 +lcs(m-1,n-1,a,b,dp);
//         }
//         else{
//             return dp[m][n]= Math.max(lcs(m-1,n,a,b,dp),lcs(m,n-1,a,b,dp));
//         }
//     }
// }


class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int m=a.length();
        int n=b.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}