class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);

        // dp[0]=nums[0];
        // dp[1]=Math.max(dp[0],nums[1]);
        // for(int i=2;i<nums.length;i++){
        //     dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        // }
        return robs(nums,0,dp);
    }
    public int robs(int[] nums,int idx,int[] dp){
        if(idx>=nums.length){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        
        int take=nums[idx]+robs(nums,idx+2,dp);
        int skip=0+robs(nums,idx+1,dp);
        return dp[idx]=Math.max(take,skip);
    }
}