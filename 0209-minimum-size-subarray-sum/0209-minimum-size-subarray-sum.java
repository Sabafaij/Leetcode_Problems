class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int sum=0;
        int idx=0;;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                ans=Math.min(ans,i-idx+1);
                sum-=nums[idx];
                idx++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}