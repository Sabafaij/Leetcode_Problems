class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return targetSum(nums,target,0,0);
    }
    public int targetSum(int[] nums, int target,int idx,int sum){
        if(idx==nums.length){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        int add=targetSum(nums,target,idx+1,sum+nums[idx]);
        int sub=targetSum(nums,target,idx+1,sum-nums[idx]);
        return add+sub;
    }
}