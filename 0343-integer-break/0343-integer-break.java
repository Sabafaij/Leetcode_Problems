class Solution {
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return maxProduct(n,dp);
    }
    public int maxProduct(int n, int[] dp){
        if(n==1){
            return 1;
        }

        if(dp[n]!=-1) return dp[n];
        int ans=0;
        for(int i=1;i<n;i++){
            int prod=i*Math.max(n-i,maxProduct(n-i,dp));
            ans=Math.max(ans,prod);
        }
        return dp[n]=ans;
    }
}