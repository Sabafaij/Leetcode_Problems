class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        if(totalSum<target){
            return 0;
        }
        int[][] dp=new int[nums.length+1][2*totalSum+1];
        for(int[] arr:dp){
            Arrays.fill(arr,Integer.MIN_VALUE);
        }
        return targetSum(nums,target,0,0,totalSum,dp);
    }
    public int targetSum(int[] nums, int target,int idx,int sum,int totalSum, int[][] dp){
        if(idx==nums.length){
            if(sum==target){
                return dp[idx][sum+totalSum]=1;
            }
            return dp[idx][sum+totalSum]=0;
        }
        if(dp[idx][sum+totalSum]!=Integer.MIN_VALUE) return dp[idx][sum+totalSum];
        int add=targetSum(nums,target,idx+1,sum+nums[idx],totalSum,dp);
        int sub=targetSum(nums,target,idx+1,sum-nums[idx],totalSum,dp);
        return dp[idx][sum+totalSum]=add+sub;
    }
}