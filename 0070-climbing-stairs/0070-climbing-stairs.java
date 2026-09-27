class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int [] dp=new int[n+1];
        // int oneStep=2;
        // int twoStep=1;
        // int currStep=0;
        // for(int i=3;i<=n;i++){
        //     currStep=oneStep+twoStep;
        //     twoStep=oneStep;
        //     oneStep=currStep;
        // }
        // return oneStep;
        return climbing(n,dp);
    }
    private int climbing(int n,int[] dp){
        if(n<=2){
            return n;
        }
        if(dp[n]!=0) return dp[n];
        return dp[n]=climbing(n-1,dp) + climbing(n-2,dp);
    }
}