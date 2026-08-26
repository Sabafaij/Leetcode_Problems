class Solution {
    public String stoneGameIII(int[] stoneValue) {
        
        int[] dp=new int[stoneValue.length];
        Arrays.fill(dp,-1001);
        int ans=diff(stoneValue,0,stoneValue.length,dp);
        if(ans==0){
            return "Tie";
        }
        return ans<0?"Bob":"Alice";
    }
    public int diff(int[] arr,int i,int n,int[] dp){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1001) return dp[i];
        int r=arr[i]-diff(arr,i+1,n,dp);
        if(i<n-1){
            r=Math.max(r,arr[i]+arr[i+1]-diff(arr,i+2,n,dp));
        }
        if(i<n-2){
            r=Math.max(r,arr[i]+arr[i+1]+arr[i+2]-diff(arr,i+3,n,dp));
        }
        dp[i]=r;
        return r;
    }
}