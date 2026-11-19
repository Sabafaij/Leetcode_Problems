class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int cur_max=nums[0];
        for(int i=1;i<nums.length;i++){
            cur_max=Math.max(cur_max+nums[i],nums[i]);
            max=Math.max(max,cur_max);
        }
        return max;
    }
}